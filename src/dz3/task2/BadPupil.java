package dz3.task2;

public class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Зовсім не приділяє уваги до навчання.");
    }
    @Override
    void read() {
        System.out.println("Не прочитав жодної книги.");
    }
    @Override
    void write() {
        System.out.println("Пише на стінах непристойні слова!");
    }
    @Override
    void relax() {
        System.out.println("Релакс 24 на 7.");
    }
}
