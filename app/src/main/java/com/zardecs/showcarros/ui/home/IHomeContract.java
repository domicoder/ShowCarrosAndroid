package com.zardecs.showcarros.ui.home;

public interface IHomeContract {

    interface IHomeView {
        void showTrademarkImages(int[] trademarkImages);
        void showTrademarkCars(String[] trademarkCars);
        void showImagesResourcesVolkswagenCars(int[] imagesResourcesVolkswagenCars);
        void showImagesResourcesToyotaCars(int[] imagesResourcesToyotaCars);
        void showImagesResourcesNissanCars(int[] imagesResourcesNissanCars);
        void showImagesResourcesMercedesBenzCars(int[] imagesResourcesMercedesBenzCars);
        void showImagesResourcesHondaCars(int[] imagesResourcesHondaCars);
        void showImagesResourcesBMWCars(int[] imagesResourcesBMWCars);
        void showImagesResourcesAudiCars(int[] imagesResourcesAudiCars);
        void showImagesResourcesAcuraCars(int[] imagesResourcesAcuraCars);
    }

    interface IHomePresenter {
        void bind(IHomeContract.IHomeView iHomeView);
        void unbind();
        void getTrademarkImages();
        void getTrademarkCars();
        void getImagesResourcesVolkswagenCars();
        void getImagesResourcesToyotaCars();
        void getImagesResourcesNissanCars();
        void getImagesResourcesMercedesBenzCars();
        void getImagesResourcesHondaCars();
        void getImagesResourcesBMWCars();
        void getImagesResourcesAudiCars();
        void getImagesResourcesAcuraCars();
    }
}
