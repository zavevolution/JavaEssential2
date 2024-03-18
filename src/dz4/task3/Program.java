package dz4.task3;

// Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створіть 2 інтерфейси Playable та Recodable.
// У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop()
// та void record() / void pause() / void stop() відповідно.
// Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
// Написати програму, яка виконує програвання та запис.

public class Program {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.stop();
        player.record();
        player.stop();
    }
}
