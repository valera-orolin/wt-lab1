package com.company.tasks1_8;

import com.company.tasks1_8.action.*;
import com.company.tasks1_8.data.*;

class Solutions {

    static void solveTask1() {
        System.out.println("1) Вычислить значение выражения по формуле \n(1 + sin(x + y)^2)/(2 + |x - (2*x) / (1 + x*x * y*y)|) + x");
        double x, y;
        while (true) {
            try {
                System.out.println("Введите x:");
                x = Main.in.nextDouble();
                System.out.println("Введите y:");
                y = Main.in.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task1Data.setParams(x, y);
        System.out.println(Task1Action.findResult());
    }

    static void solveTask2() {
        System.out.println("2) Для данной области составить программу, которая печатает true, если точка с координатами (х, " +
                "у) принадлежит закрашенной области, и false — в противном случае.");
        double x, y;
        while (true) {
            try {
                System.out.println("Введите x:");
                x = Main.in.nextDouble();
                System.out.println("Введите y:");
                y = Main.in.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task2Data.setParams(x, y);
        System.out.println(Task2Action.findResult());
    }

    static void solveTask3() {
        System.out.println("3) Вычислить значения функции F(x)=tg(x) на отрезке [a, b] с шагом h.");
        double a, b, h;
        while (true) {
            try {
                System.out.println("Введите a:");
                a = Main.in.nextDouble();
                System.out.println("Введите b:");
                b = Main.in.nextDouble();
                System.out.println("Введите h:");
                h = Main.in.nextDouble();
                if (h <= 0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task3Data.setParams(a, b, h);
        double[][] result = Task3Action.findResult();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%.3f \t %.3f\n", result[i][0], result[i][1]);
        }
    }

    static void solveTask4() {
        System.out.println("4) Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.");
        int n;
        int[] arr;
        while (true) {
            try {
                System.out.println("Введите N:");
                n = Main.in.nextInt();
                if (n <= 0) throw new Exception();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + ": ");
                    int t = Main.in.nextInt();
                    arr[i] = t;
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task4Data.setArr(arr);
        int[] result = Task4Action.findResult();
        boolean isAny = false;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                System.out.print((i + 1) + " ");
                isAny = true;
            }
        }

        if (!isAny) System.out.print("Нет простых чисел");
        System.out.println();
    }

    static void solveTask5() {
        System.out.println("5) Найти наименьшее число K элементов, которые можно " +
                "выкинуть из данной последовательности, так чтобы осталась возрастающая " +
                "подпоследовательность.");
        int n;
        int[] a;
        while (true) {
            try {
                System.out.println("Введите N:");
                n = Main.in.nextInt();
                if (n <= 0) throw new Exception();
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + ": ");
                    int t = Main.in.nextInt();
                    a[i] = t;
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task5Data.setA(a);
        int k = Task5Action.findResult();
        System.out.println(k);
    }

    static void solveTask6() {
        System.out.println("6) Получить следующую матрицу порядка n.");
        int n;
        double[] a;
        while (true) {
            try {
                System.out.println("Введите N:");
                n = Main.in.nextInt();
                if (n <= 0) throw new Exception();
                a = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + ": ");
                    double t = Main.in.nextDouble();
                    a[i] = t;
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task6Data.setA(a);
        double[][] result = Task6Action.findResult();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.printf("%.3f\t", result[i][j]);
            }
            System.out.println();
        }
    }

    static void solveTask7() {
        System.out.println("7) Упорядочить массив по возрастанию, используя сортировку Шелла.");
        int n;
        double[] a;
        while (true) {
            try {
                System.out.println("Введите N:");
                n = Main.in.nextInt();
                if (n <= 0) throw new Exception();
                a = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + ": ");
                    double t = Main.in.nextDouble();
                    a[i] = t;
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task7Data.setA(a);
        double[] result = Task7Action.findResult();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%.3f\t", result[i]);
        }
        System.out.println();
    }

    static void solveTask8() {
        System.out.println("8) Указать те места, на которые нужно вставлять элементы " +
                "последовательности b в последовательность a так, чтобы новая " +
                "последовательность оставалась возрастающей.");
        int n, m;
        double[] a, b;
        while (true) {
            try {
                System.out.println("Введите N:");
                n = Main.in.nextInt();
                if (n <= 0) throw new Exception();
                a = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + ": ");
                    double t = Main.in.nextDouble();
                    a[i] = t;
                }

                System.out.println("Введите M:");
                m = Main.in.nextInt();
                if (m <= 0) throw new Exception();
                b = new double[m];
                for (int i = 0; i < m; i++) {
                    System.out.print((i + 1) + ": ");
                    double t = Main.in.nextDouble();
                    b[i] = t;
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                Main.in.nextLine();
            }
        }
        Task8Data.setA(a);
        Task8Data.setB(b);
        int[] result = Task8Action.findResult();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
