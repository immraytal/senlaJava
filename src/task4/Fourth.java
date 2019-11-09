package task4;

/* Создать программу, которая подсчитывает сколько раз
употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
*/

import java.util.Arrays;
import java.util.Scanner;


public class Fourth {
// настроит ввод текста
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = {};
        String word;
        System.out.println("Введите текст: ");
        try {
            while (scanner.hasNextLine()) {
                scanner.nextLine().toLowerCase().split("[/,;:.!?—\\s]+");
            }

            System.out.println("Введите искомое слово: ");
            word = scanner.nextLine().toLowerCase();

        }catch (Exception e) {
            System.out.println("Проверьте введённые данные");
            return;
        }
        int counter = 0;
        for (String check:text) {
            if (word.equals(check))
                counter++;
            System.out.println(check + " ");
        }
        System.out.println("Слово " + word + " употребляется " + counter + " раз");

    }

}
