package task4;

/* Создать программу, которая подсчитывает сколько раз
употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = {} , temp = {};
        String word;
        System.out.println("Введите текст, в последней строке оставьте только q: ");      // Пример текста :One one,
        try {                                                                             //                one two 12!
            while (scanner.hasNext()) {                                                   //                q
                temp = scanner.nextLine().toLowerCase().split("[/,;:.*!?—\\s]+");
                if (temp[0].equals("q"))
                    break;
                text = Stream.concat(Arrays.stream(text), Arrays.stream(temp)).toArray(String[]::new);
            }
            System.out.println("Введите искомое слово: ");
            word = new Scanner(System.in).nextLine().toLowerCase();

        }catch (Exception e) {
            System.out.println("Проверьте введённые данные");
            return;
        }
        int counter = 0;
        for (String check:text) {
            if (word.equals(check))
                counter++;
        }
        System.out.println("Слово '" + word + "' употребляется " + counter + " раз");

    }

}
