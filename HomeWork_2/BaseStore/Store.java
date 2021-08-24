package com.company.HomeWork_2.BaseStore;

import com.company.HomeWork_2.MyBase.Box;
import com.company.HomeWork_2.MyBase.Food.PlansFoods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {
    public StoreBrand brand;
    public int id;
    public List<Box<PlansFoods>> localStorage;
    public HashMap<String,Integer> storageStatistics;

    public Store(StoreBrand brand) {
        this.brand = brand;
        this.id = (int)( Math.random()*1000);
        this.localStorage = new ArrayList<>();
        this.storageStatistics = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Store{" +
                "brand=" + brand +
                ", id=" + id +
                ", localStorage=" + localStorage +
                ", storageStatistics=" + storageStatistics +
                '}';
    }
}
