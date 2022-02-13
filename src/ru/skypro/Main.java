package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();


    }

    public static void task1() {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + ": ping pong ");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else System.out.println(i + ":");
        }
    }

    public static void task2() {
        int a = 0;
        int b = 1;
        int nextNumberOne;
        int nextNumberTwo;

        System.out.println(a + "" + "\n" + b + "");
        for (int i = 2; i <= 9; i++) {
            nextNumberOne = a + b;
            nextNumberTwo = b + nextNumberOne;
            if(i % 2 == 0) {
                System.out.println(nextNumberOne + " ");
                System.out.println(nextNumberTwo + " " );
            }
            a = b;
            b = nextNumberOne;

        }
    }
}
