package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {

        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else System.out.println(i + ":");
        }
    }

    public static void task2() {
        int a = 0;
        int b = 1;
        int nextNumber;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= 9; i++) {

            nextNumber = a + b;
            System.out.println(nextNumber + " ");
            a = b;
            b = nextNumber;
        }
    }
}
