package dz4.task2;

// Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створити клас AbstractHandler.
// У тілі класу створити методи void open(), void create(), void change(), void save().
// Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
// Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття,
// створення, редагування, збереження певного формату документа.

public class Program {
    public static void main(String[] args) {
        String fileName = "settings.txt";
        AbstractHandler handler;

        if (fileName.endsWith(".xml")) {
            handler = new XMLHandler();
            handler.create();
        } else if (fileName.endsWith(".txt")) {
            handler = new TXTHandler();
            handler.create();
        } else if (fileName.endsWith(".doc")) {
            handler = new DOCHandler();
            handler.create();
        } else {
            System.out.println("Невідомий формат файлу.");
        }
    }
}
