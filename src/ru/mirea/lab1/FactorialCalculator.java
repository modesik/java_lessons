package ru.mirea.lab1;

import java.util.Scanner;

public class FactorialCalculator {

    public static int factorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала (0 или больше): ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Ошибка: факториал не определён для отрицательных чисел.");
        } else {
            int fact = factorial(number);
            System.out.println("Факториал числа " + number + " равен " + fact);
        }

        scanner.close();
    }
}