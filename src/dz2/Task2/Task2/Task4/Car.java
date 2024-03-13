package dz2.Task2.Task2.Task4;

// Використовуючи Intelij IDEA, створити проект, пакет.
// (Наново!) Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
// Перевантажити конструктори викликаючи конструктор із конструктора.
// Створити клас Main, де створити екземляри класу Машина з різними параметрами.

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
        this();
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
        weight = 0;
        color = "";
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
        color = "";
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

}
