package com.company.tasks1_8.data;

public class Task1Data {

    private static double x;
    private static double y;

    public static void setParams(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }
}
