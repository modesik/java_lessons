package ru.mirea.lab1;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int num = sc.nextInt();
        int[] c = new int[num];
        int summ = 0;
        double sr_arif = 0f;
        for (int i = 0; i < num; i++){
            System.out.printf("Введите %d число массива: ",(i+1));
            c[i] = sc.nextInt();
            summ += c[i];
        }
        sr_arif = (double) summ / num;
        System.out.printf("Сумма элементов равна %d\n", summ);
        System.out.printf("Среднее арифметическое элоементов равна %f", sr_arif);
    }
}
