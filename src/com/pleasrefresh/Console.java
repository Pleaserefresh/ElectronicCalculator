package com.pleasrefresh;

import static com.pleasrefresh.Calculator.*;

public class Console {
    public String printAll(float p, float u, float i, float q) {
        // write your code here
        //U = Volt P = Watt I = Ampere Q = mAh
        System.out.println(p + "W / " + u + "V = " + calculateAmpere(p, u) + "A");
        System.out.println(i + "A * " + u + "V = " + calculateWatt(i, u) + "W");
        System.out.println(p + "W / " + i + "A = " + calculateVolt(p, i) + "V");
        System.out.println(q + "mAh * " + u + "V / 1000 = " + calculateWh(q, u) + "Wh");
        return "thank you!";
    }
}
