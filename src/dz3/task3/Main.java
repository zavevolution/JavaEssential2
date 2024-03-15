package dz3.task3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(23, 23, 1340000, 800, 2020, 11, 190);
        Ship ship = new Ship(67, 90, 12345678, 70, 2023, 570, "UKR");
        Car car = new Car(45, 63, 50000, 270, 2021);

        Vehicle[] vehicles = {plane, ship, car};

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
