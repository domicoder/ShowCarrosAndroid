package com.zardecs.showcarros.model.trademarkautomobiles;

import com.google.gson.annotations.SerializedName;

public class AutomobilesItem{

	@SerializedName("model_name")
	private String modelName;

	@SerializedName("photo")
	private String photo;

	public String getModelName(){
		return modelName;
	}

	public String getPhoto(){
		return photo;
	}

	@Override
 	public String toString(){
		return 
			"AutomobilesItem{" + 
			"model_name = '" + modelName + '\'' + 
			",photo = '" + photo + '\'' + 
			"}";
		}
}