package com.pleasrefresh;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //U = Volt P = Watt I = Ampere Q = mAh
        System.out.println(Calculator.calculateAmpere(100, 12) + "A");
        System.out.println(Calculator.calculateWatt(8.333333f, 12)+ "W");
        System.out.println(Calculator.calculateVolt(100, 8.333333f )+ "V");
        System.out.println(Calculator.calculateWh(4000, 12)+ "Wh");

    }

}
