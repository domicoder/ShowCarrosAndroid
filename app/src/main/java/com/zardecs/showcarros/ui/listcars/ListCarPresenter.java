package com.zardecs.showcarros.ui.listcars;

import com.zardecs.showcarros.data.repository.ListCarRepository;

public class ListCarPresenter implements IListCarsContract.IListCarsPresenter {

    private IListCarsContract.IListCarsView iListCarsView;
    private ListCarRepository listCarRepository;

    public ListCarPresenter(ListCarRepository listCarRepository){
        this.listCarRepository = listCarRepository;
    }

    @Override
    public void bind(IListCarsContract.IListCarsView iListCarsView) {
        this.iListCarsView = iListCarsView;
    }

    @Override
    public void unbind() {
        iListCarsView = null;
    }

    @Override
    public void getSourceInfoModelCars() {
        iListCarsView.showSourceInfoModelCars(listCarRepository.getSourceInfoModelCars());
    }
}
