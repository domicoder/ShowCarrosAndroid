package com.zardecs.showcarros.model.trademarkautomobiles;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrademarkAutomobilesItem{

	@SerializedName("automobiles")
	private List<AutomobilesItem> automobiles;

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private String logo;

	public List<AutomobilesItem> getAutomobiles(){
		return automobiles;
	}

	public String getName(){
		return name;
	}

	public String getLogo(){
		return logo;
	}

	@Override
 	public String toString(){
		return 
			"TrademarkAutomobilesItem{" + 
			"automobiles = '" + automobiles + '\'' + 
			",name = '" + name + '\'' + 
			",logo = '" + logo + '\'' + 
			"}";
		}
}