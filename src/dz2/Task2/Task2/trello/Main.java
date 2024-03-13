package dz2.Task2.Task2.trello;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Іван", "Смартфон", 157, 1200.0, LocalDate.of(2023, 12, 15)),
                new Product("Іван", "Холодильник", 52, 2200.0, LocalDate.of(2024, 1, 17)),
                new Product("Іван", "Телевізор", 95, 1800.0, LocalDate.of(2022, 7, 19)),
                new Product("Іван", "Кавоварка", 234, 200.0, LocalDate.of(2023, 10, 25)),
                new Product("Іван", "Пральна машина", 49, 800.0, LocalDate.of(2023, 12, 10)),
                new Product("Іван", "Фен", 120, 120.0, LocalDate.of(2021, 11, 17))
        };

        LocalDate oneYearAgo = LocalDate.of(2023, 3, 12);

        for (Product p : products) {
            if (p.dateOfSale.isAfter(oneYearAgo)) {
                System.out.println(p);
            }
        }
    }
}
