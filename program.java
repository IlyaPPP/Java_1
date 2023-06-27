// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение
// до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        ThreeNum();
        Kalkul();
        Just();
    }

    public static void ThreeNum() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Scanner.nextInt();
        int n = 0;
        int s = 1;
        for (int i = 0; i < number; i++) {
            n += i;
            s *= i + 1;
        }
        System.out.println("Треугольное число -> " + n);
        System.out.println("Факториал -> " + s);

        System.out.println("\n\n\n");
    }

    public static void Just() {
        for (int i = 2; i < 1000; i++) {
            int s = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    s++;
            }
            if (s == 0)
                System.out.println(i);
        }
    }

    public static void Kalkul() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        Integer num1 = Scanner.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие");
        String deystwie = scan.nextLine();
        System.out.println("Введите переменную: ");
        Integer num2 = Scanner.nextInt();
        if (deystwie.intern() == "*")
            System.out.println(num1 * num2);
        else if ((deystwie.intern() == "/") || deystwie.intern() == ":")
            System.out.println(num1 / num2);
        else if (deystwie.intern() == "%")
            System.out.println(num1 % num2);
        else if (deystwie.intern() == "+")
            System.out.println(num1 + num2);
        else if (deystwie.intern() == "-")
            System.out.println(num1 - num2);
        System.out.println("\n\n\n");
    }
}