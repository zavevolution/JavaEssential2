package dz5.task3;

// Використовуючи Intelij IDEA, створити проект, пакет.
// Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.

import dz5.task2.Zoo;

public class Program {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.animals.size());
        zoo.animals.remove(7);
        zoo.animals.remove(5);
        zoo.animals.remove(3);
        System.out.println(zoo.animals.size());
    }
}
