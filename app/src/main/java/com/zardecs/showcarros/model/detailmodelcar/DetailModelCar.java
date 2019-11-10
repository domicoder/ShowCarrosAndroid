package com.zardecs.showcarros.model.detailmodelcar;

public class DetailModelCar {

    private final int[] listViewImagesCarsId;
    private final String[] trademarkCars;
    private int positionDetails;

    public DetailModelCar(int[] listViewImagesCarsId, String[] trademarkCars) {
        this.listViewImagesCarsId = listViewImagesCarsId;
        this.trademarkCars = trademarkCars;
    }

    public int getPositionDetails() {
        return positionDetails;
    }

    public void setPositionDetails(int positionDetails) {
        this.positionDetails = positionDetails;
    }

    public int[] getListViewImagesCarsId() {
        return listViewImagesCarsId;
    }

    public String[] getTrademarkCars() {
        return trademarkCars;
    }
}
