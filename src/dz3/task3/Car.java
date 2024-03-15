package dz3.task3;

// Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle.
// У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
// Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
// Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.

public class Car extends Vehicle {
    public Car(int x, int y, double price, int speed, int yearOfProduced) {
        super(x, y, price, speed, yearOfProduced);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "}";
    }
}
