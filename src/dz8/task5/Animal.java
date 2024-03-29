package dz8.task5;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tile;

    public Animal(String name, int age, boolean tile) {
        this.name = name;
        this.age = age;
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name +
                ", вік: " + age +
                ", хвіст: " + (tile ? "так." : "ні.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tile == animal.tile && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tile);
    }
}
