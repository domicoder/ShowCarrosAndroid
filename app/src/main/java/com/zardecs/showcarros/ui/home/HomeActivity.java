package com.zardecs.showcarros.ui.home;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.zardecs.showcarros.R;
import com.zardecs.showcarros.data.adapter.CustomGridViewAdapter;
import com.zardecs.showcarros.data.repository.HomeRepository;
import com.zardecs.showcarros.model.trademarkautomobiles.TrademarkAutomobilesResponse;
import com.zardecs.showcarros.ui.listcars.ListCarActivity;
import com.zardecs.showcarros.utils.Constants;

public class HomeActivity extends AppCompatActivity implements IHomeContract.IHomeView {

    private GridView mGridView;

    private int[] trademarkImages;
    private String[] trademarkCars;
    private int[] imagesResourcesVolkswagenCars;
    private int[] imagesResourcesToyotaCars;
    private int[] imagesResourcesNissanCars;
    private int[] imagesResourcesMercedesBenzCars;
    private int[] imagesResourcesHondaCars;
    private int[] imagesResourcesBMWCars;
    private int[] imagesResourcesAudiCars;
    private int[] imagesResourcesAcuraCars;

    HomeRepository homeRepository = new HomeRepository();
    IHomeContract.IHomePresenter iHomePresenter = new HomePresenter(homeRepository);

    TrademarkAutomobilesResponse trademarkAutomobilesResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mGridView = findViewById(R.id.gridViewImages);

        iHomePresenter.bind(this);

        iHomePresenter.getTrademarkImages();
        iHomePresenter.getTrademarkCars();
        iHomePresenter.getImagesResourcesVolkswagenCars();
        iHomePresenter.getImagesResourcesToyotaCars();
        iHomePresenter.getImagesResourcesNissanCars();
        iHomePresenter.getImagesResourcesMercedesBenzCars();
        iHomePresenter.getImagesResourcesHondaCars();
        iHomePresenter.getImagesResourcesBMWCars();
        iHomePresenter.getImagesResourcesAudiCars();
        iHomePresenter.getImagesResourcesAcuraCars();

        // Using Retrofit
        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyJsonApiService myJsonApiService = retrofit.create(MyJsonApiService.class);

        Call<TrademarkAutomobilesResponse> call = myJsonApiService.getTrademarkAutomobilesResponse();
        call.enqueue(new Callback<TrademarkAutomobilesResponse>() {
            @Override
            public void onResponse(Call<TrademarkAutomobilesResponse> call, Response<TrademarkAutomobilesResponse> response) {

                *//*if (response.isSuccessful()){
                    trademarkAutomobilesResponse = response.body();

                    assert trademarkAutomobilesResponse != null;
                    List<TrademarkAutomobilesItem> trademarkAutomobilesItemList = trademarkAutomobilesResponse.getData().getTrademarkAutomobiles();
                    for (TrademarkAutomobilesItem trademarkAutomobilesItem: trademarkAutomobilesItemList){
                        Toast.makeText(HomeActivity.this, "Marca :"+trademarkAutomobilesItem.getName(), Toast.LENGTH_SHORT).show();
                    }

                }*//*
            }

            @Override
            public void onFailure(Call<TrademarkAutomobilesResponse> call, Throwable t) {
//                Toast.makeText(HomeActivity.this, "Ocurrio un problema.", Toast.LENGTH_SHORT).show();
            }
        });*/

        CustomGridViewAdapter customGridViewAdapter = new CustomGridViewAdapter(getApplicationContext(), trademarkImages, trademarkCars);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mGridView.setNestedScrollingEnabled(true);
        }

        mGridView.setAdapter(customGridViewAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (trademarkImages[position]){
                    case R.drawable.marca1:
                        Intent intentSendVolkswagenCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendVolkswagenCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesVolkswagenCars);
                        // Send 1, but index is 0
                        // Because in ListCarActivity variable positionTrademarkName were null
                        // And null int not support != operator, in this case i use -> equal 0
                        intentSendVolkswagenCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 1);
                        intentSendVolkswagenCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendVolkswagenCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[0]);
                        startActivity(intentSendVolkswagenCars);
                        break;
                    case R.drawable.marca2:
                        Intent intentSendToyotaCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendToyotaCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesToyotaCars);
                        intentSendToyotaCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 2);
                        intentSendToyotaCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendToyotaCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[1]);
                        startActivity(intentSendToyotaCars);
                        break;
                    case R.drawable.marca3:
                        Intent intentSendNissanCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendNissanCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesNissanCars);
                        intentSendNissanCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 3);
                        intentSendNissanCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendNissanCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[2]);
                        startActivity(intentSendNissanCars);
                        break;
                    case R.drawable.marca4:
                        Intent intentSendMercedesBenzCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendMercedesBenzCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesMercedesBenzCars);
                        intentSendMercedesBenzCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 4);
                        intentSendMercedesBenzCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendMercedesBenzCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[3]);
                        startActivity(intentSendMercedesBenzCars);
                        break;
                    case R.drawable.marca5:
                        Intent intentSendHondaCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendHondaCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesHondaCars);
                        intentSendHondaCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 5);
                        intentSendHondaCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendHondaCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[4]);
                        startActivity(intentSendHondaCars);
                        break;
                    case R.drawable.marca6:
                        Intent intentSendBMWCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendBMWCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesBMWCars);
                        intentSendBMWCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 6);
                        intentSendBMWCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendBMWCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[5]);
                        startActivity(intentSendBMWCars);
                        break;
                    case R.drawable.marca7:
                        Intent intentSendAudiCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendAudiCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesAudiCars);
                        intentSendAudiCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 7);
                        intentSendAudiCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendAudiCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[6]);
                        startActivity(intentSendAudiCars);
                        break;
                    case R.drawable.marca8:
                        Intent intentSendAcuraCars = new Intent(HomeActivity.this, ListCarActivity.class);
                        intentSendAcuraCars.putExtra(Constants.LIST_CARS_BY_TRADEMARK, imagesResourcesAcuraCars);
                        intentSendAcuraCars.putExtra(Constants.POSITION_TRADEMARK_IN_LIST, 8);
                        intentSendAcuraCars.putExtra(Constants.LIST_NAME_OF_TRADEMARK, trademarkCars);
                        intentSendAcuraCars.putExtra(Constants.TRADEMARK_LOGO, trademarkImages[7]);
                        startActivity(intentSendAcuraCars);
                        break;
                }
            }
        });
    }

    private void setTrademarkAutomobilesResponse(TrademarkAutomobilesResponse trademarkAutomobilesResponse){
        this.trademarkAutomobilesResponse = trademarkAutomobilesResponse;
    }

    @Override
    protected void onDestroy() {
        iHomePresenter.unbind();
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_setting_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_about:
                AboutDialog aboutDialog = new AboutDialog();
                aboutDialog.show(getSupportFragmentManager(), "about dialog");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void showTrademarkImages(int[] trademarkImages) {
        this.trademarkImages = trademarkImages;
    }

    @Override
    public void showTrademarkCars(String[] trademarkCars) {
        this.trademarkCars = trademarkCars;
    }

    @Override
    public void showImagesResourcesVolkswagenCars(int[] imagesResourcesVolkswagenCars) {
        this.imagesResourcesVolkswagenCars = imagesResourcesVolkswagenCars;
    }

    @Override
    public void showImagesResourcesToyotaCars(int[] imagesResourcesToyotaCars) {
        this.imagesResourcesToyotaCars = imagesResourcesToyotaCars;
    }

    @Override
    public void showImagesResourcesNissanCars(int[] imagesResourcesNissanCars) {
        this.imagesResourcesNissanCars = imagesResourcesNissanCars;
    }

    @Override
    public void showImagesResourcesMercedesBenzCars(int[] imagesResourcesMercedesBenzCars) {
        this.imagesResourcesMercedesBenzCars = imagesResourcesMercedesBenzCars;
    }

    @Override
    public void showImagesResourcesHondaCars(int[] imagesResourcesHondaCars) {
        this.imagesResourcesHondaCars = imagesResourcesHondaCars;
    }

    @Override
    public void showImagesResourcesBMWCars(int[] imagesResourcesBMWCars) {
        this.imagesResourcesBMWCars = imagesResourcesBMWCars;
    }

    @Override
    public void showImagesResourcesAudiCars(int[] imagesResourcesAudiCars) {
        this.imagesResourcesAudiCars = imagesResourcesAudiCars;
    }

    @Override
    public void showImagesResourcesAcuraCars(int[] imagesResourcesAcuraCars) {
        this.imagesResourcesAcuraCars = imagesResourcesAcuraCars;
    }
}
