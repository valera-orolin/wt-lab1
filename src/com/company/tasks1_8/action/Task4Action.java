package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task4Data;

import java.math.BigInteger;

public class Task4Action {

    public static int[] findResult() {
        int result[] = new int[Task4Data.getArr().length];
        for (int i = 0; i < result.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(Task4Data.getArr()[i]);
            if (bigInteger.isProbablePrime((int) Math.log(Task4Data.getArr()[i]))) {
                result[i] = 1;
            }
        }
        return result;
    }
}
