package task1;

/*Создать программу, которая будет сообщать, является ли целое число,
        введенное пользователем, чётным или нечётным, простым или составным.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.*/

import java.util.Scanner;


public class First {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите одно целое число: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0){                        // Проверка на чётность
                System.out.println("Число " + number + " четное и, соответственно, составное");
                return;
            } else {
                System.out.println("Число " + number + " нечетное");
            }
                                                         //Простое или составное?
            if (number <= 0) {
                System.out.println("Требуется натуральное число(>0)");
                return;
            }

            if (number < 2) {
                System.out.println("Число " + number + " не является ни простым, ни составным");
                return;
            }

            for (int k = 2; k <= Math.sqrt(number); k++) {
                if (number % k == 0) {
                    System.out.println("Число " + number + " составное");
                    return;
                }
            }
            System.out.println("Число " + number + " простое");
        } else {
            System.out.println("Число не определено, проверьте введённые данные");
        }

    }

}
