package dz7.task3;

// Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
//
//  назву товару;
//
//  назву магазину, в якому продається товар;
//
//  вартість товару у гривнях.
//
// Написати програму, яка виконує такі дії:
//
//  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
//
//  виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).

import java.util.Arrays;
import java.util.Scanner;

class StoryNotFoundException extends Exception {
    public StoryNotFoundException(String s) {
        super(s);
    }
}

public class Program {
    public static void main(String[] args) throws StoryNotFoundException {
        Price[] products = new Price[2];
        setProducts(products);
        Arrays.sort(products);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введіть назву магазину щоб отримати перелік наявних товарів: ");
        String story = in1.nextLine();
        if (checkStory(products, story)) {
            for (Price price : products) {
                if (price.storeName.equalsIgnoreCase(story))
                    System.out.println(price);
            }
        } else {
            throw new StoryNotFoundException("Невідомий магазин.");
        }
    }

    static boolean checkStory(Price[] ar, String sn) {
        for (Price price : ar) {
            if (price.storeName.equalsIgnoreCase(sn)) return true;
        }
        return false;
    }

    static void setProducts(Price[] ar) {
        String productName, storyName;
        int price, count = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Заповніть базу даних.");
            System.out.print("Введіть назву товару: ");
            productName = in.next();
            System.out.print("Введіть назву магазину: ");
            storyName = in.next();
            System.out.print("Введіть ціну товару: ");
            price = in.nextInt();
            ar[count] = new Price(productName, storyName, price);
            count++;
        } while (count < 2);
    }
}
