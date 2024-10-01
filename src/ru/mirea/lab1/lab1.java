package ru.mirea.lab1;
import java.util.Scanner; // импортируем класс
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2; System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) {
/* hasNextInt()возвращает истинну если с потока ввода
можно считать целое число*/
            i = sc.nextInt(); /* считывает целое число из потока
ввода и сохраняет в переменную i*/
            System.out.println(i*2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
