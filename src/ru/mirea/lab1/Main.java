package ru.mirea.lab1;

public class Main {
    public static void main(String[] args) {
        int b = 100;
        int[] c = new int[10];
        c[4] = 40;
        System.out.println("Hello world!");
        System.out.println(b);
        System.out.println(c.length);
        System.out.println(c[4]);
        System.out.println(c[0]);
        System.out.println(c[9]);
        int k = 110;
        int g = 10;
        if (k == g) {
            System.out.println("True");
        } else {
            System.out.println("False\n");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        int f = 5;
        while (f > 0){
            f-=1;
            System.out.printf("f= %d\n",f);
        }
        int hello = 3;
        do {
            hello +=1;
            System.out.printf("hello = %d\n", hello);
        } while (hello < 3);


    }
}