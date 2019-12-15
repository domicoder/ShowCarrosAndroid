package com.zardecs.showcarros.ui.listcars;

public interface IListCarsContract {
    interface IListCarsView{
        void showSourceInfoModelCars(String[] sourceInfoModelCars);
    }
    interface IListCarsPresenter{
        void bind(IListCarsView iListCarsView);
        void unbind();
        void getSourceInfoModelCars();
    }
}
