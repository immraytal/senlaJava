package task3;

/*Создать программу, которая будет:
- подсчитывать количество слов в предложении
- выводить их в отсортированном виде
- делать первую букву каждого слова заглавной.
Предложение вводится вручную. (Разделитель пробел (“ ”)).*/

import java.util.Arrays;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        String[] sentence;
        System.out.println("Введите предложение: ");
        try {
            sentence = (new Scanner(System.in).nextLine()).split("[,;:.!?—\\s]+");

        }catch (Exception e) {
            System.out.println("Проверьте введённые данные");
            return;
        }
        System.out.println("Количество слов  - " + sentence.length);
        Arrays.sort(sentence);

        System.out.print("Вывод в отсортированном ввиде с заглавными буквами - ");
        for (String word:sentence) {
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.print(word + " ");
        }
    }
}
