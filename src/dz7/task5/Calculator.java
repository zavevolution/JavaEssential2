package dz7.task5;

// Створіть проект за допомогою IntelliJ IDEA.
// Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
// (add – додавання, sub – віднімання, mul – множення, div – поділ).
// Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток.
// Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
// У разі виникнення помилок повинні викидатися винятки.

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public  double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Спроба ділення на 0");
        return a / b;
    }
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор.");
        System.out.print("Введіть перше значення: ");
        double a = in.nextDouble();
        System.out.print("Введіть друге значення: ");
        double b = in.nextDouble();
        System.out.print("Введіть операцію: ");
        String operation = in.next();

        switch (operation) {
            case "+":
                System.out.println(a + operation + b + " = " + calculator.add(a, b));
                break;
            case "-":
                System.out.println(a + operation + b + " = " + calculator.sub(a, b));
                break;
            case "*":
                System.out.println(a + operation + b + " = " + calculator.mul(a, b));
                break;
            case "/":
                System.out.println(a + operation + b + " = " + calculator.div(a, b));
                break;
            default:
                throw new InvalidParameterException("Невідома операція");
        }
    }
}
