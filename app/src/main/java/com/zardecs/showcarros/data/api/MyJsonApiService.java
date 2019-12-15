package com.zardecs.showcarros.data.api;

import com.zardecs.showcarros.model.trademarkautomobiles.TrademarkAutomobilesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyJsonApiService {
    // https://pastebin.com/raw/XSax61Di
    // https://api.myjson.com/bins/1fa7om
    // @GET("raw/XSax61Di")
    @GET("bins/1fa7om")
    Call<TrademarkAutomobilesResponse> getTrademarkAutomobilesResponse();
}
