package dz7.task2;

// Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
//
//  прізвище та ініціали працівника;
//
//  назва посади;
//
//  рік надходження на роботу.
//
//Написати програму, яка виконує такі дії:
//
//  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
//
//  якщо значення року введено не у відповідному форматі, видає виняток.
//
//  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    final static int year = 2024;

    public static Worker[] testWorker = {
            new Worker("Приходько Р.Л", "менеджер", 2015),
            new Worker("Олійник Р.Д", "сторож", 1999),
            new Worker("Чалий Е.Л", "касир", 2008),
            new Worker("Антипко Т.А", "бугалтер", 2023),
            new Worker("Рябко Д.В", "водій", 2024),
    };
    public static void main(String[] args) throws Exception {
        Worker[] workers = new Worker[5];
        setWorkers(workers);
        Arrays.sort(workers);
        int years;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть стаж роботи працівника: ");
        years = in.nextInt();
        showWorkers(workers, years);
    }

    public static void setWorkers(Worker[] ar) throws Exception {
        Scanner in = new Scanner(System.in);
        int count = 1;
        do {
            System.out.println("Введіть дані працівника № " + count);
            System.out.print("прізвище та ініціали працівника: ");
            String name = in.nextLine();
            System.out.print("назва посади: ");
            String posada = in.nextLine();
            System.out.println("рік надходження на роботу: ");

            try {
                int date = in.nextInt();
                ar[count - 1] = new Worker(name, posada, date);
            } catch (InputMismatchException e) {
                throw new Exception("Невірний формат дати.");
            }
            count++;
        } while (count <= 5);
        in.close();
    }

    public static void showWorkers(Worker[] ar, int y) {
        for (Worker worker : ar) {
            if ((year - worker.yearOfEmployment) > y)
                System.out.println(worker);
        }
    }
}
