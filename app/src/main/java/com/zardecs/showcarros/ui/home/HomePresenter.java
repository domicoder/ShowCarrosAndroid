package com.zardecs.showcarros.ui.home;

import com.zardecs.showcarros.data.repository.HomeRepository;

public class HomePresenter implements IHomeContract.IHomePresenter {

    private IHomeContract.IHomeView iHomeView;

    private HomeRepository homeRepository;

    public HomePresenter(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public void bind(IHomeContract.IHomeView iHomeView) {
        this.iHomeView = iHomeView;
    }

    @Override
    public void unbind() {
        iHomeView = null;
    }

    @Override
    public void getTrademarkImages() {

        iHomeView.showTrademarkImages(homeRepository.getTrademarkImages());
    }

    @Override
    public void getTrademarkCars() {
        iHomeView.showTrademarkCars(homeRepository.getTrademarkCars());
    }

    @Override
    public void getImagesResourcesVolkswagenCars() {
        iHomeView.showImagesResourcesVolkswagenCars(homeRepository.getImagesResourcesVolkswagenCars());
    }

    @Override
    public void getImagesResourcesToyotaCars() {
        iHomeView.showImagesResourcesToyotaCars(homeRepository.getImagesResourcesToyotaCars());
    }

    @Override
    public void getImagesResourcesNissanCars() {
        iHomeView.showImagesResourcesNissanCars(homeRepository.getImagesResourcesNissanCars());
    }

    @Override
    public void getImagesResourcesMercedesBenzCars() {
        iHomeView.showImagesResourcesMercedesBenzCars(homeRepository.getImagesResourcesMercedesBenzCars());
    }

    @Override
    public void getImagesResourcesHondaCars() {
        iHomeView.showImagesResourcesHondaCars(homeRepository.getImagesResourcesHondaCars());
    }

    @Override
    public void getImagesResourcesBMWCars() {
        iHomeView.showImagesResourcesBMWCars(homeRepository.getImagesResourcesBMWCars());
    }

    @Override
    public void getImagesResourcesAudiCars() {
        iHomeView.showImagesResourcesAudiCars(homeRepository.getImagesResourcesAudiCars());
    }

    @Override
    public void getImagesResourcesAcuraCars() {
        iHomeView.showImagesResourcesAcuraCars(homeRepository.getImagesResourcesAcuraCars());
    }
}
