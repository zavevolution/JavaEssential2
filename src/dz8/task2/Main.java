package dz8.task2;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");
        Device device3 = new Device("Xiaomi", 110, "XM1234567CD");
        Device device4 = device3;
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 90, "FK384757BN", 198, "MAC:73943949");

        System.out.println();
        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
        System.out.println(device4);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);

        System.out.println();
        System.out.println("device1.equals(device2): " + device1.equals(device2));
        System.out.println("device1.equals(device3): " + device1.equals(device3));
        System.out.println("device4.equals(device3): " + device4.equals(device3));

        System.out.println();
        System.out.println("hashCode device1: " + device1.hashCode());
        System.out.println("hashCode device2: " + device2.hashCode());
        System.out.println("hashCode device3: " + device3.hashCode());
        System.out.println("hashCode device4: " + device4.hashCode());
        System.out.println("hashCode monitor: " + monitor.hashCode());
        System.out.println("hashCode ethernetAdapter: " + ethernetAdapter.hashCode());
    }
}
