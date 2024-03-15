package dz3.task3;

public class Ship extends Vehicle {
    int passengerAmount;
    String residence;

    public Ship(int x, int y, double price, int speed, int yearOfProduced, int passengerAmount, String residence) {
        super(x, y, price, speed, yearOfProduced);
        this.passengerAmount = passengerAmount;
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Ship{" + super.toString() +
                ", passengerAmount=" + passengerAmount +
                ", residence='" + residence + '\'' +
                '}';
    }
}
