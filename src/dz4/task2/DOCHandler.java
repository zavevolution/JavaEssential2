package dz4.task2;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Document DOC is open.");
    }

    @Override
    void create() {
        System.out.println("New document DOC is created.");
    }

    @Override
    void change() {
        System.out.println("Document DOC is changed.");
    }

    @Override
    void save() {
        System.out.println("Document DOC is saved.");
    }
}
