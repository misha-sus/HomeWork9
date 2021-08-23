package com.company.MyBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WareHouse {

    public static List<Box> setBoxes() {
        Random random = new Random();
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box<>(0, 0, WareHouse.generate(random.nextInt(2) + 1)));
        boxes.add(new Box<>(1, 1, WareHouse.generate(random.nextInt(10) + 1)));
        boxes.add(new Box<>(2, 2, WareHouse.generate(random.nextInt(10) + 1)));
        boxes.add(new Box<>(3, 3, WareHouse.generate(random.nextInt(10) + 1)));
        boxes.add(new Box<>(4, 4, WareHouse.generate(random.nextInt(10) + 1)));

        return boxes;
    }



    public static List<PlansFoods> generate(int count) {
        Random random = new Random();
        List<PlansFoods> plansFoods = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            int choiceSortFruits =  random.nextInt(Fruits.sortFruit.length - 1);
            int choiceNameFruits =  random.nextInt(Fruits.nameFruit.size());
            int choiceSortVeg =  random.nextInt(Vegetables.sortVeg.length - 1);
            int choiceNameVeg =  random.nextInt(Vegetables.nameVeg.size());

            plansFoods.add(
                    new Fruits(random.nextInt(100),
                            random.nextInt(100),
                            Fruits.sortFruit[choiceSortFruits],
                            Fruits.nameFruit.get(choiceNameFruits)
                    ));
            plansFoods.add(
                    new Vegetables(
                            random.nextInt(100),
                            random.nextInt(100),
                            Vegetables.sortVeg[choiceSortVeg],
                            Vegetables.nameVeg.get(choiceNameVeg)
                    )
            );
        }

        return plansFoods;
    }
}
