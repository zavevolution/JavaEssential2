package dz2.Task2.Task2.Task4;

// Використовуючи Intelij IDEA, створити проект, пакет.
// (Наново!) Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
// Перевантажити конструктори викликаючи конструктор із конструктора.
// Створити клас Main, де створити екземляри класу Машина з різними параметрами.

import dz2.Task2.Task2.Task3.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2020, 220);
        Car car4 = new Car(2022, 270, 1800);
        Car car5 = new Car(2022, 270, 1800, "Red");
    }
}
