package com.company.tasks9_15.task9_11;

import java.util.ArrayList;

public class Basket {

    private static ArrayList<Ball> basketPull = new ArrayList<>();

    public static ArrayList<Ball> getBasketPull() {
        return basketPull;
    }

    static void addBall(Ball ball) {
        basketPull.add(ball);
    }

    static int findColorBallsAmount(String ballColor) {
        int ballsAmount = 0;
        for (int i = 0; i < basketPull.size(); ++i) {
            if (basketPull.get(i).getColor() == ballColor) {
                ballsAmount++;
            }
        }
        return ballsAmount;
    }

    static int findBallsWeight() {
        int ballsWeight = 0;
        for (int i = 0; i < basketPull.size(); ++i) {
            ballsWeight += basketPull.get(i).getWeight();
        }
        return ballsWeight;
    }
}
