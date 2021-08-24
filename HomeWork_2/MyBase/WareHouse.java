package com.company.HomeWork_2.MyBase;


import com.company.HomeWork_2.BaseStore.Store;
import com.company.HomeWork_2.BaseStore.StoreDataBase;
import com.company.HomeWork_2.MyBase.Food.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WareHouse {
    List<Box<PlansFoods>>baseStorage;


    public static void initializeStartingSupplies(){
        generatePlansFood().stream().map((g) -> {
            Random random = new Random();
            Store randomStore = StoreDataBase.allStores.get(random.nextInt(StoreDataBase.allStores.size()));
            return new Box(randomStore.id, randomStore.brand,g);
        });
    }


    public static List<PlansFoods> generatePlansFood(){
        List<PlansFoods> generatedFood = new ArrayList<>();
        Random random = new Random();
        int greenFoodsCount = random.nextInt(30)+10;

        for(int i = 0;i<greenFoodsCount;i++){
            int greenFoodChoice = random.nextInt(4);
            double price = random.nextDouble()*30+10;
            double mass = random.nextDouble()*5 +20;

            PlansFoods plansFood;

            switch (greenFoodChoice){
                case 0:
                    plansFood = new Apple(price,mass);
                    break;
                case 1:
                    plansFood = new Banana(price,mass);
                    break;
                case 2:
                    plansFood = new Potato(price,mass);
                    break;
                case 3:
                default:
                    plansFood = new Cabbage(price,mass);
                    break;
            }
            generatedFood.add(plansFood);
        }
        return generatedFood;
    }
}
