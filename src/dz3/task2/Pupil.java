package dz3.task2;

public class Pupil {

    void study() {
        System.out.println("Метод study() класу Pupil.");
    }
    void read() {
        System.out.println("Метод read() класу Pupil.");
    }
    void write() {
        System.out.println("Метод write() класу Pupil.");
    }
    void relax() {
        System.out.println("Метод relax() класу Pupil.");
    }

    void show() {
        System.out.println("Pupil:");
        study();
        read();
        write();
        relax();
        System.out.println();
    }
}
