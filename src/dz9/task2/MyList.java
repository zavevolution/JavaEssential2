package dz9.task2;

// Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList.
// Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
// Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
// індексатор для отримання значення елемента за вказаним індексом
// і властивість тільки для читання для отримання загальної кількості елементів.

public class MyList <T> {
    private int length;
    private T[] list;

    public MyList() {
        this.length = -1;
        this.list = (T[]) new Object[10];
    }

    public MyList(T[] list) {
        this.length = list.length;
        this.list = list;
    }

    public int size() {
        return length + 1;
    }

    public void add(T element) {
        list[++length] = element;
    }

    public T get(int index) {
        if (this.length < 0) {
            System.out.println("MyList порожній.");
            return null;
        }
        if (index > this.length) throw new IndexOutOfBoundsException();
        return list[index];
    }

    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        list1.add(3);
        list1.add(5);
        System.out.println(list1.size());
        System.out.println(list1.get(1));
    }
}
