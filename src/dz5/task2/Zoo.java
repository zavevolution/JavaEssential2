package dz5.task2;

import java.util.ArrayList;

// Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
// У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.

public class Zoo {
    public ArrayList<String> animals = new ArrayList<>();

    public Zoo() {
        animals.add(0, "Слон");
        animals.add(1, "Лев");
        animals.add(2, "Корова");
        animals.add(3, "Тигр");
        animals.add(4, "Крокодил");
        animals.add(5, "Мавпа");
        animals.add(6, "Страус");
        animals.add(7, "Олень");
    }

    public void show() {
        System.out.println(animals);
    }
}
