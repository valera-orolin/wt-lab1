package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task7Data;

public class Task7Action {

    public static double[] findResult() {
        double[] a = Task7Data.getA();
        int i, j, step;
        double tmp;
        int n = a.length;
        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = a[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < a[j - step])
                        a[j] = a[j - step];
                    else
                        break;
                }
                a[j] = tmp;
            }
        }
        return a;
    }
}
