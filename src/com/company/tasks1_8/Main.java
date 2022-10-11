package com.company.tasks1_8;

import java.util.Scanner;

public class Main {

    public static final Scanner in = new Scanner(System.in);

    private static void chooseTask() {
        boolean isWorking = true;
        while (isWorking) {
            System.out.println("Введите номер нужной задачи. Введите 0 для выхода.");
            int t = in.nextInt();
            switch (t) {
                case 0 :
                    isWorking = false;
                    break;
                case 1:
                    Solutions.solveTask1();
                    break;
                case 2:
                    Solutions.solveTask2();
                    break;
                case 3:
                    Solutions.solveTask3();
                    break;
                case 4:
                    Solutions.solveTask4();
                    break;
                case 5:
                    Solutions.solveTask5();
                    break;
                case 6:
                    Solutions.solveTask6();
                    break;
                case 7:
                    Solutions.solveTask7();
                    break;
                case 8:
                    Solutions.solveTask8();
                    break;
                default:
                    System.out.println("Ошибка. Попробуйте еще раз.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        chooseTask();
        in.close();
    }
}
