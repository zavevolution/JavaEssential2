package dz3.task3;

public class Vehicle {
    int x;
    int y;
    double price;
    int speed;
    int yearOfProduced;

    public Vehicle(int x, int y, double price, int speed, int yearOfProduced) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.yearOfProduced = yearOfProduced;
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduced=" + yearOfProduced;
    }
}
