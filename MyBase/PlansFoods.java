package com.company.MyBase;

public abstract class PlansFoods {
    public int mass;
    public int price;
    public String sort;

    public PlansFoods(int mass, int price, String sort) {
        this.mass = mass;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "PlansFoods{" +
                "mass=" + mass +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }
}
