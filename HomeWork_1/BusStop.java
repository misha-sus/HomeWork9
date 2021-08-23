package com.company.HomeWork_1;

public class BusStop {
    private String nameStop;
    private int wentToBus;
    private int cameToBus;

    public BusStop(String nameStop, int wentToBus, int cameToBus) {
        this.nameStop = nameStop;
        this.wentToBus = wentToBus;
        this.cameToBus = cameToBus;
    }


    public int getWentToBus() {
        return wentToBus;
    }

    public int getCameToBus() {
        return cameToBus;
    }

    @Override
    public String toString() {
        return "BusStop{" +
                "nameStop='" + nameStop + '\'' +
                ", wentToBus=" + wentToBus +
                ", cameToBus=" + cameToBus +
                '}';
    }

}
