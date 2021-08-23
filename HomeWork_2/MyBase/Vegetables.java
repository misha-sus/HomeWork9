package com.company.HomeWork_2.MyBase;

import java.util.Arrays;
import java.util.List;

public class Vegetables extends PlansFoods {
    String nameVegetables  ;

    static List<String> nameVeg = Arrays.asList("Картофель","Капуста");
    static String [] sortVeg = {"Карликовые","Великаны"};

    public Vegetables(int mass, int price, String sort, String nameVegetables) {
        super(mass, price, sort);
        this.nameVegetables = nameVegetables;
    }

    @Override
    public String toString() {
        return String.format("%s сорт '%s', Вес = %d, Цена за кг = %dРуб ",nameVegetables,sort,mass,price);

    }
}
