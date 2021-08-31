package com.pleasrefresh;

public class Main {
    public static void main(String[] args) {
        Console con = new Console();
        System.out.println(con.printAll(
                100, //Watt
                12, //Volt
                8.333333f, //Ampere
                300) //mAh
        );
    }
}
