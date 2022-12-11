package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        // Error : name has private access in com.driver.RWOnly
        r.setName("Accio");
        System.out.println(r.getName());
    }
}