package com.company.HomeWork_2.BaseStore;

import java.util.HashMap;

public class Four {
    public String name;
    public HashMap<Integer,String> mag;

    public Four(String name, HashMap<Integer, String> mag) {
          name = "Четверочка";
        this.mag = mag;
    }

    @Override
    public String toString() {
        return "Four{" +
                "name='" + name + '\'' +
                ", mag=" + mag +
                '}';
    }
}
