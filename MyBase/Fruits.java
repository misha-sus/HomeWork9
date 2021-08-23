package com.company.MyBase;

import java.util.Arrays;
import java.util.List;

public class Fruits extends PlansFoods {
    String nameFruits ;

    static List<String> nameFruit = Arrays.asList("Бaнаны","Яблоки");
    static String [] sortFruit = {"Зеленые","Желтые"};
    public Fruits(int mass, int price, String sort, String nameFruits) {
        super(mass, price, sort);
        this.nameFruits = nameFruits;
    }

    @Override
    public String toString() {
        return String.format("%s сорт '%s', Вес = %d, Цена за кг = %dРуб ",nameFruits,sort,mass,price);
    }

}
