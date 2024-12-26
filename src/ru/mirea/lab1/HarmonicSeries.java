package ru.mirea.lab1;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                // Для первого числа выводим как int
                System.out.println(i);
            } else {
                // Для остальных чисел выводим как float
                float harmonicNumber = 1.0f / i;
                System.out.printf("%.3f\n", harmonicNumber);
            }
        }
    }
}
//1 практика переделать гаромнические 1 перменная инт готово
// написать программу с аргументами командной строки готово
// 7 написать факториал

// факториал ввод с клавиатуры и проверка на число больше нуля
// разобраться с аргументами ввода

