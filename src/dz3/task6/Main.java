package dz3.task6;

// Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створити клас Printer.
// У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
// Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів,
// та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
// Обязательно используйте приведення типів.
public class Main {
    public static void main(String[] args) {
        Printer pr = new RedPrinter();
        pr.print("Hello");
        pr = new GreenPrinter();
        pr.print("World");
        pr = (Printer) pr;
        pr.print("Java");

    }
}
