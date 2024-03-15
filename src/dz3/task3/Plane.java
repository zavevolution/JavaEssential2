package dz3.task3;

public class Plane extends Vehicle {
    int height;

    int passengerAmount;

    public Plane(int x, int y, double price, int speed, int yearOfProduced, int height, int passengerAmount) {
        super(x, y, price, speed, yearOfProduced);
        this.height = height;
        this.passengerAmount = passengerAmount;
    }

    @Override
    public String toString() {
        return "Plane{" + super.toString() +
                ", height=" + height +
                ", passengerAmount=" + passengerAmount +
                '}';
    }
}
