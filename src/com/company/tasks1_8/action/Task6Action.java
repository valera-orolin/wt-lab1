package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task6Data;

public class Task6Action {

    public static double[][] findResult() {
        double[] a = Task6Data.getA();
        double[][] result = new double[a.length][a.length];
        int t = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = a[t];
                t++;
                if (t == result.length) t = 0;
            }
            t++;
        }
        return result;
    }
}
