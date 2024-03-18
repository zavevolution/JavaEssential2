package dz5.task4;

// Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас Main, створити список цілих чисел і за допомогою
// ListIterator пройтись по списку і збільшити значення на 1.

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) arr.add(i);

        System.out.println(arr);

        ListIterator<Integer> iterator = arr.listIterator();

        while (iterator.hasNext()) {
            iterator.set(iterator.next() + 1);
        }
        System.out.println(arr);
    }
}
