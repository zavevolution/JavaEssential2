package dz3.task6;

public class GreenPrinter extends Printer {
    @Override
    void print(String value) {
        System.out.println("Color green");
        System.out.println(value);
    }
}
