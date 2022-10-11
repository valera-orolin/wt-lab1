package com.company.tasks1_8.action;

import com.company.tasks1_8.data.Task2Data;

public class Task2Action {

    public static String findResult() {
        double x = Task2Data.getX();
        double y = Task2Data.getY();
        if ((((x > 4) || (x < -4)) || ((y > 5) || (y < 0))) && (((x > 6) || (x < -6)) || ((y > 0) || (y < -3))))
            return "false";
        else
            return "true";
    }
}
