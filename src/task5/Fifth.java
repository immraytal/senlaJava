package task5;

/*Создать программу, которая в последовательности от 0 до N,
находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности N вводится вручную и не должна превышать 100.
*/

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        int n;

        System.out.println("Введите длину последовательности N<=100:");
        try {
            n = new Scanner(System.in).nextInt();
            if (n<1 || n>100)
                throw new Exception("Не выполняется 0<n<100");
        } catch (Exception e ) {
            System.out.println("Проверьте введённые данные");
            return;
        }
        for (int i = 0; i < n+1; i++) {
            if (Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString()))
                System.out.println(i + " ");
        }
    }
}
