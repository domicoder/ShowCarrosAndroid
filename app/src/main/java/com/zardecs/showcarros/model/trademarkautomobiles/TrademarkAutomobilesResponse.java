package com.zardecs.showcarros.model.trademarkautomobiles;

import com.google.gson.annotations.SerializedName;

public class TrademarkAutomobilesResponse{

	@SerializedName("data")
	private Data data;

	@SerializedName("status")
	private String status;

	public Data getData(){
		return data;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"TrademarkAutomobilesResponse{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}