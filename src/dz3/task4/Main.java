package dz3.task4;

import java.util.Scanner;

public class Main {
    public static final String PRO_KEY = "P123";
    public static final String EXP_KEY = "E123";

    public static DocumentWorker doc;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = "";
        System.out.print("Введіть ключ продукту якщо у вас є: ");
        System.out.println();
        key = in.next();

        if (key.equals(PRO_KEY)) {
            doc = new ProDocumentWorker();
        } else if (key.equals(EXP_KEY)) {
            doc = new ExpertDocumentWorker();
        } else {
            doc = new DocumentWorker();
        }

        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();
    }
}
