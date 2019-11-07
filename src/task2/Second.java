package task2;

/*Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
*/

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

        } else {
            System.out.println("Числа не определены, проверьте введённые данные");
        }
    }
}
