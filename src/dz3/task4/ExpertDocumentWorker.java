package dz3.task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ збережений в новому форматі");
    }
}
