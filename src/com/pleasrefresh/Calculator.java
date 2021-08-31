package com.pleasrefresh;

public class Calculator {
    //Ampere calculator Watt / Volt = Ampere
    public static float calculateAmpere(float p, float u) {
        return p / u;
    }

    //Watt calculator Ampere * Volt = Watt
    public static float calculateWatt(float i, float u) {
        return i * u;
    }

    //Volt calculator Watt / Ampere = Volt
    public static float calculateVolt(float p, float i) {
        return p / i;
    }

    //mAh => Wh
    public static float calculateWh(float q, float u) {
        return q * u / 1000;
    }
}
