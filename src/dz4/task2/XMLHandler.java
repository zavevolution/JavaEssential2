package dz4.task2;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Document XML is open.");
    }

    @Override
    void create() {
        System.out.println("New document XML is created.");
    }

    @Override
    void change() {
        System.out.println("Document XML is changed.");
    }

    @Override
    void save() {
        System.out.println("Document XML is saved.");
    }
}
