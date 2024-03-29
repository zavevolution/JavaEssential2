package dz8.task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 90, "FK384757BN", 198, "MAC:73943949");


        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);
    }
}
