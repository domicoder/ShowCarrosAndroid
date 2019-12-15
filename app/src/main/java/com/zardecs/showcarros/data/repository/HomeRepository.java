package com.zardecs.showcarros.data.repository;

import com.zardecs.showcarros.R;

public class HomeRepository {

    public HomeRepository(){}

    public int[] getTrademarkImages(){
        return new int[]{R.drawable.marca1, R.drawable.marca2, R.drawable.marca3, R.drawable.marca4,
                R.drawable.marca5, R.drawable.marca6,R.drawable.marca7,R.drawable.marca8};
    }

    public String[] getTrademarkCars(){
        return new String[]{"Volkswagen", "Toyota", "Nissan",
                "Mercedes-Benz", "Honda",
                "BMW", "Audi", "Acura"};
    }

    public int[] getImagesResourcesVolkswagenCars(){
        return new int[]{R.drawable.car1, R.drawable.car2, R.drawable.car3, R.drawable.car4};
    }

    public int[] getImagesResourcesToyotaCars(){
        return new int[]{R.drawable.car5, R.drawable.car6, R.drawable.car7, R.drawable.car8};
    }

    public int[] getImagesResourcesNissanCars(){
        return new int[]{R.drawable.car9, R.drawable.car10, R.drawable.car11, R.drawable.car12};
    }

    public int[] getImagesResourcesMercedesBenzCars(){
        return new int[]{R.drawable.car13, R.drawable.car14, R.drawable.car15, R.drawable.car16};
    }

    public int[] getImagesResourcesHondaCars(){
        return new int[]{R.drawable.car17, R.drawable.car18, R.drawable.car19, R.drawable.car20};
    }

    public int[] getImagesResourcesBMWCars(){
        return new int[]{R.drawable.car21, R.drawable.car22, R.drawable.car23, R.drawable.car24};
    }

    public int[] getImagesResourcesAudiCars(){
        return new int[]{R.drawable.car25, R.drawable.car26, R.drawable.car27, R.drawable.car28};
    }

    public int[] getImagesResourcesAcuraCars(){
        return new int[]{R.drawable.car29, R.drawable.car30, R.drawable.car31, R.drawable.car32};
    }

}
