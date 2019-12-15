package com.zardecs.showcarros.model.trademarkautomobiles;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

	@SerializedName("trademark_automobiles")
	private List<TrademarkAutomobilesItem> trademarkAutomobiles;

	public List<TrademarkAutomobilesItem> getTrademarkAutomobiles(){
		return trademarkAutomobiles;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"trademark_automobiles = '" + trademarkAutomobiles + '\'' + 
			"}";
		}
}