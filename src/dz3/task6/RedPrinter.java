package dz3.task6;

public class RedPrinter extends Printer {
    @Override
    void print(String value) {
        System.out.println("Color red");
        System.out.println(value);
    }
}
