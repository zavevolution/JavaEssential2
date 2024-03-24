package dz6.task4;

// Створіть проект за допомогою IntelliJ IDEA.
// Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
// який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(),
// який повертає рядок з кольором автомобіля, і містити перевантажений метод toString(),
// який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.

enum Vehicles {
    BMW("red", 50000),
    Volkswagen("white", 36000),
    Opel("gray", 34000),
    Mercedes("black", 60000);
    private String color;
    private int price;

    Vehicles(String color, int price) {
        this.color = color;
        this.price = price;
    }

    String getColor() { return color; }

    @Override
    public String toString() {
        return "\nАвтомобіль: " +
                name() +
                "\nколір: " + color +
                "\nціна: " + price;
    }
}

public class VehiclesTest {
    public static void main(String[] args) {
        Vehicles vehicle = Vehicles.Mercedes;
        System.out.println(vehicle.getColor());
        System.out.println(vehicle);
    }
}
