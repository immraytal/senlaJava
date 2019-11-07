package task2;

/*Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
*/

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("Введите 2 целых числа через пробел: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Числа не определены, проверьте введённые данные");
            return;
        }
        System.out.println(NOD(num1,num2)+" "+NOK(num1,num2));
    }
    private static int NOD(int num1,int num2) {
        int min;
        int nod = 0;
        if(num1 > num2)
            min = num2;
        else
            min = num1;

        for (int count = 1; count <= min; count++) {
            if (num1 % count == 0 && num2 % count == 0){
                if (count>nod)
                    nod = count;
            }
        }
        return nod;
    }
    private static int NOK(int num1,int num2) {
        int count;
        int nok = 0;
        if (num1 < num2)
            count = num2;
        else
            count = num1;

        while (nok == 0) {
            if (count % num1 == 0 && count % num2 == 0)
                nok = count;
            count++;
        }
        return nok;
    }
}
