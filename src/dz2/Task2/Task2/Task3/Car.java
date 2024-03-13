package dz2.Task2.Task2.Task3;

// Використовуючи Intelij IDEA, створити проект, пакет.
// (Наново!) Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
// Перевантажити конструктори. Створити клас Main, де створити екземляри класу Машина з різними параметрами.
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        year = 0;
        speed = 0.0;
        weight = 0;
        color = "";
    }

    public Car(int year) {
        this.year = year;
        speed = 0.0;
        weight = 0;
        color = "";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        weight = 0;
        color = "";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        color = "";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }


}
