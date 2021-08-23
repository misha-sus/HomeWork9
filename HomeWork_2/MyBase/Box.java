package com.company.HomeWork_2.MyBase;

import java.util.List;

public class Box <T> {
    public int mark;
   public int markMag;
    public List<T> list ;

    public Box(int mark, int markMag, List<T> list) {
        this.mark = mark;
        this.markMag = markMag;
        this.list = list;
    }

    @Override
    public String toString() {
        return String.format("Корбка.Номер магазина - %d, номер сети %d.Список товаров = %s",mark,markMag,list);
    }
}
