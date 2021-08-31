package com.pleasrefresh;

public class Calculator {
    //Ampere calculator Watt / Volt = Ampere
    public static float calculateAmpere(float p, float u) {
        float i = p / u;
        return i;
    }

    //Watt calculator Ampere * Volt = Watt
    public static float calculateWatt(float i, float u) {
        float p = i * u;
        return p;
    }

    //Volt calculator Watt / Ampere = Volt
    public static float calculateVolt(float p, float i) {
        float u = p / i;
        return u;
    }

    //mAh => Wh
    public static float calculateWh(float q, float u) {
        float wh = q * u / 1000;
        return wh;
    }
}
