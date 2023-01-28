package com.Java.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int token1 = 0;
        int counter1 = 0;
        int i1 = 1;
        do {
            counter1 += i1;
            System.out.print(token1 + " ");
            int x1 = (int) (Math.random() * 10) % 3;
            int dice1 = (int) (Math.random() * 10) % 3;
            switch (x1) {
                case 0: {
                    break;
                }
                case 1: {
                    token1 -= dice1;
                    if (token1 < 0) {
                        token1 = 0;
                    } else if (token1 == 100) {
                        token1 = 100;
                    }
                    break;
                }
                default:
                    token1 += dice1;
                    if (token1 > 100) {
                        token1 -= dice1;
                    }
            }
        } while (!(token1 == 100));
        System.out.println("100");
        System.out.println(counter1);
        System.out.println("Winning point Reached");
    }
}
