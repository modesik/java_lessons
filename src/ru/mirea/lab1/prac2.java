package ru.mirea.lab1;

import  java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int num = sc.nextInt();
        int[] mass = new int[num];
        for (int i = 0; i < num; i++){
            System.out.printf("Введите %d элемент массива: ", i +1);
            mass[i] = sc.nextInt();
        }
        int sum = 0;
        int do_wh = 0, wh = 0;
        do{
            sum += mass[do_wh];
            do_wh += 1;
        } while (do_wh < num);
        System.out.printf("Сумма посчитанная циклом do_while: %d\n", sum);
        sum = 0;
        while (wh < num){
            sum += mass[wh];
            wh += 1;
        }
        System.out.printf("Сумма посчитанная циклом while: %d\n", sum);
        int min_arg = 100;
        int max_arg = -100;
        for (int i = 0; i < num; i++){
            if (min_arg > mass[i]){
                min_arg = mass[i];
            }
            if (max_arg < mass[i]){
                max_arg = mass[i];
            }
        }
        System.out.printf("Максимальный аргумент массива %d\n", max_arg);
        System.out.printf("Минимальный аргумент массива %d\n", min_arg);
    }
}
