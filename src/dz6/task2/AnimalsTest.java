package dz6.task2;

// Створіть проект за допомогою IntelliJ IDEA.
// Створіть перерахунковий тип (enum) Animals, що містить конструктор,
// який повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(),
// який повинен повертати назву екземпляра та вік тварини.

enum Animals {
    Dog(3), Cat(5), Cow(7);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Звір: " +
                name() + " -> вік " +
                age;
    }
}

public class AnimalsTest {
    public static void main(String[] args) {
        Animals animals = Animals.Dog;
        System.out.println(animals);
    }
}
