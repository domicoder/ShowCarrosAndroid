package com.zardecs.showcarros.ui.detailscar;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.zardecs.showcarros.R;
import com.zardecs.showcarros.utils.Constants;

public class DetailsCarActivity extends AppCompatActivity {

    private WebView mWebviewInfoModelCar;
    private ProgressBar mProgressWebviewLoading;

    private String titleTrademarkModelCar;
    private String urlToShowInfoModelCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_car);

        mWebviewInfoModelCar = (WebView) findViewById(R.id.webviewInfoModelCar);
        mProgressWebviewLoading = (ProgressBar) findViewById(R.id.progressWebviewLoading);

        Bundle bundle = getIntent().getExtras();

        if (getIntent().hasExtra(Constants.TITLE_ACTIONBAR_BY_TRADEMARK)){
            titleTrademarkModelCar = bundle.getString(Constants.TITLE_ACTIONBAR_BY_TRADEMARK);
        }

        if (getIntent().hasExtra(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW)){
            urlToShowInfoModelCar = bundle.getString(Constants.URL_INFO_MODEL_CAR_TO_WEBVIEW);
        }

        mWebviewInfoModelCar.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                setTitle("Cargando información...");
                mProgressWebviewLoading.setIndeterminate(false);
                mProgressWebviewLoading.setVisibility(View.VISIBLE);
                mProgressWebviewLoading.setProgress(newProgress * 100);

                if (newProgress == 100){
                    setTitle(titleTrademarkModelCar);
                    mProgressWebviewLoading.setVisibility(View.GONE);
                }
            }
        });
        mWebviewInfoModelCar.setWebViewClient(new WebViewClient());
        mWebviewInfoModelCar.loadUrl(urlToShowInfoModelCar);
    }
}
