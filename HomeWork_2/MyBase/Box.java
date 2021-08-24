package com.company.HomeWork_2.MyBase;

import com.company.HomeWork_2.BaseStore.StoreBrand;

import java.util.List;

public class Box <PlansFoods> {
    public int idStore;
    public StoreBrand storeName;
    public PlansFoods food;

    public Box(int idStore, StoreBrand storeName, PlansFoods food) {
        this.idStore = idStore;
        this.storeName = storeName;
        this.food = food;
    }

    public PlansFoods getFood(){
        return food;
    }

}
