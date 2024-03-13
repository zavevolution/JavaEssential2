package dz3.task2;

// Створити клас, який представляє навчальний клас ClassRoom.
// Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
// Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil
// від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
// Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
// Передбачте можливість, що користувач може передати 2 або 3 аргументи.
// Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.

public class ClassRoom {
    public Pupil[] pupils = new Pupil[4];

    public ClassRoom() {}
    public ClassRoom(Pupil p) {
        pupils[0] = p;
    }

    public ClassRoom(Pupil p, Pupil p1) {
        pupils[0] = p;
        pupils[1] = p1;
    }

    public ClassRoom(Pupil p, Pupil p1, Pupil p2) {
        pupils[0] = p;
        pupils[1] = p1;
        pupils[2] = p2;
    }

    public ClassRoom(Pupil p, Pupil p1, Pupil p2, Pupil p3) {
        pupils[0] = p;
        pupils[1] = p1;
        pupils[2] = p2;
        pupils[3] = p3;
    }

    void showPupils() {
        for (Pupil p : pupils)
            p.show();
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(
              new Pupil(),
              new ExcelentPupil(),
              new GoodPupil(),
              new BadPupil()
        );

        classRoom.showPupils();
    }
}
