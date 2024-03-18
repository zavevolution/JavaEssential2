package dz4.task2;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Document TXT is open.");
    }

    @Override
    void create() {
        System.out.println("New document TXT is created.");
    }

    @Override
    void change() {
        System.out.println("Document TXT is changed.");
    }

    @Override
    void save() {
        System.out.println("Document TXT is saved.");
    }
}
