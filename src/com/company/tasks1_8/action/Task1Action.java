package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task1Data;

public class Task1Action {

    public static double findResult() {
        double x = Task1Data.getX();
        double y = Task1Data.getY();
        double a1 = 1 + Math.pow(Math.sin(x + y), 2);
        double a2 = 2 + Math.abs(x - (2*x) / (1 + x*x * y*y));
        return a1 / a2 + x;
    }
}
