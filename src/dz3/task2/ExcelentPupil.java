package dz3.task2;

public class ExcelentPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Учень приділяє навчанню - 8 годин у день.");
    }
    @Override
    void read() {
        System.out.println("Читає багато літератури різних жанрів.");
    }
    @Override
    void write() {
        System.out.println("Багато пише, складає вірші.");
    }
    @Override
    void relax() {
        System.out.println("Відпочиває на вихідних, продить час з родиною.");
    }
}
