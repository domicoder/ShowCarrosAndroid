package com.zardecs.showcarros.data.repository;

public class ListCarRepository {
    public ListCarRepository(){}

    public String[] getSourceInfoModelCars(){
        return new String[]{
                "https://es.wikipedia.org/wiki/Volkswagen",
                "https://es.wikipedia.org/wiki/Toyota",
                "https://es.wikipedia.org/wiki/Nissan",
                "https://es.wikipedia.org/wiki/Mercedes-Benz",
                "https://es.wikipedia.org/wiki/Honda",
                "https://es.wikipedia.org/wiki/BMW",
                "https://es.wikipedia.org/wiki/Audi",
                "https://es.wikipedia.org/wiki/Acura"
        };
    }
}
