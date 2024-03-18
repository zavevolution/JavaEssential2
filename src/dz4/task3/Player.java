package dz4.task3;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Йде відтворення музики...");
    }

    @Override
    public void record() {
        System.out.println("Йде запис музики...");
    }

    @Override
    public void pause() {
        System.out.println("Пауза.");
    }

    @Override
    public void stop() {
        System.out.println("Стоп.");
    }
}
