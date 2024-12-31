package org.example;
import java.util.Random;

public class MinNumber {
    public static void main(String[] args) {
        Random rnd = new Random();

        int num1 = rnd.nextInt(100);
        int num2 = rnd.nextInt(100);
        int num3 = rnd.nextInt(100);

        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);

        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Мінімальне число: " + min);
    }
}