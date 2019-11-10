package com.zardecs.showcarros.ui.listcars;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.zardecs.showcarros.R;
import com.zardecs.showcarros.data.adapter.CustomListViewCarsAdapter;
import com.zardecs.showcarros.model.detailmodelcar.DetailModelCar;
import com.zardecs.showcarros.ui.detailscar.DetailsCarActivity;
import com.zardecs.showcarros.utils.Constants;

import java.util.ArrayList;

public class ListCarActivity extends AppCompatActivity {

    private int imagesResourcesCars[];

    private String trademarkCars[];

    private ListView listViewCars;

    private final String sourceInfoModelCars[] = {
            "https://es.wikipedia.org/wiki/Volkswagen",
            "https://es.wikipedia.org/wiki/Toyota",
            "https://es.wikipedia.org/wiki/Nissan",
            "https://es.wikipedia.org/wiki/Mercedes-Benz",
            "https://es.wikipedia.org/wiki/Honda",
            "https://es.wikipedia.org/wiki/BMW",
            "https://es.wikipedia.org/wiki/Audi",
            "https://es.wikipedia.org/wiki/Acura"
    };

    CustomListViewCarsAdapter customListViewCarsAdapter;
    private int positionTrademarkName = 0;

    private ImageView mImgTradeMarkInListCars;
    private TextView mTvTrademarkInListCars;

    private Button mBtnShowInfoCarModel;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);
        listViewCars = (ListView) findViewById(R.id.listViewCars);
        mImgTradeMarkInListCars = (ImageView) findViewById(R.id.imgTradeMarkInListCars);
        mTvTrademarkInListCars = (TextView) findViewById(R.id.tvTrademarkInListCars);

        Bundle bundle = getIntent().getExtras();

        if (bundle.getIntArray(Constants.LIST_CARS_BY_TRADEMARK) != null){
            imagesResourcesCars = bundle.getIntArray(Constants.LIST_CARS_BY_TRADEMARK);
        }

        if (bundle.getStringArray(Constants.LIST_NAME_OF_TRADEMARK) != null){
            trademarkCars = bundle.getStringArray(Constants.LIST_NAME_OF_TRADEMARK);
        }

        if (bundle.getInt(Constants.POSITION_TRADEMARK_IN_LIST) != 0){
            positionTrademarkName = bundle.getInt(Constants.POSITION_TRADEMARK_IN_LIST);
        }

        if (bundle.getInt(Constants.TRADEMARK_LOGO) != 0){
            //GET trademark logo position in class R
            mImgTradeMarkInListCars.setImageResource(bundle.getInt(Constants.TRADEMARK_LOGO));
        }

        mTvTrademarkInListCars.setText(trademarkCars[positionTrademarkName-1]);

        DetailModelCar detailModelCar = new DetailModelCar(imagesResourcesCars, trademarkCars);
        detailModelCar.setPositionDetails(positionTrademarkName-1);

        ArrayList<DetailModelCar> detailModelCarArrayList = new ArrayList<>();
        detailModelCarArrayList.add(detailModelCar);

        customListViewCarsAdapter = new CustomListViewCarsAdapter(getApplicationContext(), 0, detailModelCarArrayList);

        listViewCars.setAdapter(customListViewCarsAdapter);

        listViewCars.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                long viewId = view.getId();

                if (viewId == R.id.btnShowInfoCarModel){
                    switch (imagesResourcesCars[position]){
                        case R.drawable.car1:
                        case R.drawable.car2:
                        case R.drawable.car3:
                        case R.drawable.car4:
                            Intent intentVolkswagenDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentVolkswagenDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[0]);
                            intentVolkswagenDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[0]);
                            startActivity(intentVolkswagenDetails);
                            break;
                        case R.drawable.car5:
                        case R.drawable.car6:
                        case R.drawable.car7:
                        case R.drawable.car8:
                            Intent intentToyotaDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentToyotaDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[1]);
                            intentToyotaDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[1]);
                            startActivity(intentToyotaDetails);
                            break;
                        case R.drawable.car9:
                        case R.drawable.car10:
                        case R.drawable.car11:
                        case R.drawable.car12:
                            Intent intentNissanDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentNissanDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[2]);
                            intentNissanDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[2]);
                            startActivity(intentNissanDetails);
                            break;
                        case R.drawable.car13:
                        case R.drawable.car14:
                        case R.drawable.car15:
                        case R.drawable.car16:
                            Intent intentMercedesBenzDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentMercedesBenzDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[3]);
                            intentMercedesBenzDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[3]);
                            startActivity(intentMercedesBenzDetails);
                            break;
                        case R.drawable.car17:
                        case R.drawable.car18:
                        case R.drawable.car19:
                        case R.drawable.car20:
                            Intent intentHondaDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentHondaDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[4]);
                            intentHondaDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[4]);
                            startActivity(intentHondaDetails);
                            break;
                        case R.drawable.car21:
                        case R.drawable.car22:
                        case R.drawable.car23:
                        case R.drawable.car24:
                            Intent intentBMWDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentBMWDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[5]);
                            intentBMWDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[5]);
                            startActivity(intentBMWDetails);
                            break;
                        case R.drawable.car25:
                        case R.drawable.car26:
                        case R.drawable.car27:
                        case R.drawable.car28:
                            Intent intentAudiDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentAudiDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[6]);
                            intentAudiDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[6]);
                            startActivity(intentAudiDetails);
                            break;
                        case R.drawable.car29:
                        case R.drawable.car30:
                        case R.drawable.car31:
                        case R.drawable.car32:
                            Intent intentAcuraDetails = new Intent(ListCarActivity.this, DetailsCarActivity.class);
                            intentAcuraDetails.putExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK, trademarkCars[7]);
                            intentAcuraDetails.putExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW, sourceInfoModelCars[7]);
                            startActivity(intentAcuraDetails);
                            break;
                        default:
                            break;
                    }
                }
            }
        });

    }
}
