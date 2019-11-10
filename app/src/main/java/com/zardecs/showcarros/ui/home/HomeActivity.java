package com.zardecs.showcarros.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zardecs.showcarros.R;
import com.zardecs.showcarros.data.adapter.CustomGridViewAdapter;
import com.zardecs.showcarros.ui.listcars.ListCarActivity;
import com.zardecs.showcarros.utils.Constants;

public class HomeActivity extends AppCompatActivity {

    private final int trademarkImages[] = {R.drawable.marca1, R.drawable.marca2, R.drawable.marca3, R.drawable.marca4,
            R.drawable.marca5, R.drawable.marca6,R.drawable.marca7,R.drawable.marca8};

    private final String trademarkCars[] = {"Volkswagen", "Toyota", "Nissan",
            "Mercedes-Benz", "Honda",
            "BMW", "Audi", "Acura"};

    // Volkswagen cars
    private final int imagesResourcesVolkswagenCars[] = {R.drawable.car1, R.drawable.car2, R.drawable.car3, R.drawable.car4};

    // Toyota cars
    private final int imagesResourcesToyotaCars[] = {R.drawable.car5, R.drawable.car6, R.drawable.car7, R.drawable.car8};

    // Nissan cars
    private final int imagesResourcesNissanCars[] = {R.drawable.car9, R.drawable.car10, R.drawable.car11, R.drawable.car12};

    // Mercedes-Benz cars
    private final int imagesResourcesMercedesBenzCars[] = {R.drawable.car13, R.drawable.car14, R.drawable.car15, R.drawable.car16};

    // Honda cars
    private final int imagesResourcesHondaCars[] = {R.drawable.car17, R.drawable.car18, R.drawable.car19, R.drawable.car20};

    // BMW cars
    private final int imagesResourcesBMWCars[] = {R.drawable.car21, R.drawable.car22, R.drawable.car23, R.drawable.car24};

    // Audi cars
    private final int imagesResourcesAudiCars[] = {R.drawable.car25, R.drawable.car26, R.drawable.car27, R.drawable.car28};

    // Acura cars
    private final int imagesResourcesAcuraCars[] = {R.drawable.car29, R.drawable.car30, R.drawable.car31, R.drawable.car32};

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = findViewById(R.id.gridViewImages);

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
}
