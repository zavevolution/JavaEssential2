package dz5.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Використовуючи Intelij IDEA, створити клас Friends.
// За допомогою методів ArrayList додати масив імена друзів.
// Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Dmitro");
        friends.add("Artem");
        friends.add("Alvina");
        friends.add("Oleksandr");
        friends.add("Konstantin");
        friends.add("Taras");
        friends.add("Ivan");
        System.out.println(friends);

        Collections.sort(friends);
        System.out.println(friends);
    }
}
