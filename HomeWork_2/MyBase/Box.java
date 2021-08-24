package com.company.HomeWork_2.MyBase;

import java.util.List;

public class Box <PlansFoods> {
    public int idStore;
    public int storeName;
    public PlansFoods food;

    public Box(int idStore, int storeName, PlansFoods food) {
        this.idStore = idStore;
        this.storeName = storeName;
        this.food = food;
    }

    public PlansFoods getFood(){
        return food;
    }

    //    @Override
//    public String toString() {
//        return String.format("Корбка.Номер магазина - %d, номер сети %d.Список товаров = %s",mark,markMag,list);
//    }
}
