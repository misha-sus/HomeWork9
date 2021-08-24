package com.company.HomeWork_2;

import com.company.HomeWork_2.BaseStore.StoreDataBase;
import com.company.HomeWork_2.MyBase.WareHouse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        WareHouse.generatePlansFood();
        StoreDataBase.generateStores();
        System.out.println(StoreDataBase.allStores);
        WareHouse.initializeStartingSupplies();

    }


}


