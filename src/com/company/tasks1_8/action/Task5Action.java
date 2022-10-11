package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task5Data;

public class Task5Action {

    public static int findResult() {
        int[] arr = Task5Data.getA();
        int max = arr[0];
        int k = 0;
        int j = 1;
        int[] ost = new int[arr.length];
        ost[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ost[j] = arr[i];
                j++;
            } else {
                k++;
            }
        }
        return k;
    }
}
