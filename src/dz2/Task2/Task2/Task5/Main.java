package dz2.Task2.Task2.Task5;

// Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола.
// Створити клас Main, де запустити цей метод.

public class Main {
    public static void main(String[] args) {
        double radius = 30;
        System.out.println("Площа кола з радіусом " + radius + " = " + MyArea.areaOfCircle(radius));
    }
}
