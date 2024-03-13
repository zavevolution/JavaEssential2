package dz3.task2;

public class GoodPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Учень приділяє навчанню - 4 години у день.");
    }
    @Override
    void read() {
        System.out.println("Інколи читає художню літературу.");
    }
    @Override
    void write() {
        System.out.println("Пише різні поеми.");
    }
    @Override
    void relax() {
        System.out.println("Дивиться розважальні передачі, грає у компютерні ігри.");
    }
}
