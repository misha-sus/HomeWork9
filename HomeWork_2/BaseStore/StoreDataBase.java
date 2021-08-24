package com.company.HomeWork_2.BaseStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreDataBase {
    public static List<Store> allStores;

    public static void generateStores(){
        allStores = new ArrayList<>();

        Random random = new Random();
        int storesCount = random.nextInt(5);
        for(int i = 0;i < storesCount; i++){
            int storeBrandIndex = random.nextInt(StoreBrand.values().length);
            allStores.add(new Store(StoreBrand.values()[storeBrandIndex]));
        }

    }

}
