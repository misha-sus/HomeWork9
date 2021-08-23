package com.company.HomeWork_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BusStop> busStopList = new ArrayList<>();

        busStopList.add(new BusStop("Пирогово",10, 2));
        busStopList.add(new BusStop("Макс Смирнова", 1, 3));
        busStopList.add(new BusStop("9 мая ", 2, 3));
        busStopList.add(new BusStop("Оборонная", 1, 0));

        int sum = busStopList.stream()
                .map(x1 -> (x1.getWentToBus() - x1.getCameToBus()))
                .filter(i -> i >0)
                .collect(Collectors.toList()).stream()
                .reduce((x, y) -> x + y).orElse(0);
        System.out.println(sum);

    }



}
