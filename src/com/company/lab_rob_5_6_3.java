package com.company;

public class lab_rob_5_6_3 {
    public static void main(String[] args) {
        System.out.print("Вкажіть число для округлення: ");
        double a = (7.5);
        int b = (int) a;
        double c = (a - b);
        double x = c + 0.5;
        int r = (int) a + (int) x;
        System.out.println(r);
    }
}
