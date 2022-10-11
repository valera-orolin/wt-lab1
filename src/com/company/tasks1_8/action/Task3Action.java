package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task3Data;

public class Task3Action {

    public static double[][] findResult() {
        double a = Task3Data.getA();
        double b = Task3Data.getB();
        double h = Task3Data.getH();
        double[][] result = new double[(int) ((b - a) / h) + 1][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new double[2];
        }
        for (int i = 0; a <= b; a+=h, i++) {
            result[i][0] = a;
            result[i][1] = Math.tan(a);
        }
        return result;
    }
}
