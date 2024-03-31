package dz9.task5;

// Створіть проект за допомогою IntelliJ IDEA.
// Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
// який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).

public class MyClass {
    public static <T> T factoryMethod() {
        return (T)(new Object());
    }

    public static void main(String[] args) {
        String str = MyClass.factoryMethod();
    }
}
