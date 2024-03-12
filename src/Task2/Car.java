package Task2;

// Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас Машина з полями рік(int), колір(String).
// Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
// Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.

public class Car {
    private int year;
    private String color;

    public Car() {
        year = 0;
        color = "black";
    }

    public Car(int year) {
        this.year = year;
        this.color = "black";
    }

    public Car(String color) {
        this.year = 0;
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }


}
