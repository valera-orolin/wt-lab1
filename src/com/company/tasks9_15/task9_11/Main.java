package com.company.tasks9_15.task9_11;

public class Main {

    public static void main(String[] args) {
        Ball ball1 = new Ball("white", 40);
        Ball ball2 = new Ball("red", 140);
        Ball ball3 = new Ball("blue", 100);
        Ball ball4 = new Ball("white", 80);
        Ball ball5 = new Ball("white", 30);
        Ball ball6 = new Ball("red", 150);
        Ball ball7 = new Ball("green", 85);
        Ball ball8 = new Ball("brown", 20);

        Basket.addBall(ball1);
        Basket.addBall(ball2);
        Basket.addBall(ball3);
        Basket.addBall(ball4);
        Basket.addBall(ball5);
        Basket.addBall(ball6);
        Basket.addBall(ball7);
        Basket.addBall(ball8);

        System.out.println("Amount of white balls: " + Basket.findColorBallsAmount("white"));
        System.out.println("Weight of the balls: " + Basket.findBallsWeight());
    }
}
