package trello;

import java.time.LocalDate;

public class Product {
    String seller;
    String name;
    int count;
    double price;
    LocalDate dateOfSale;

    public Product(String seller, String name, int count, double price, LocalDate dateOfSale) {
        this.seller = seller;
        this.name = name;
        this.count = count;
        this.price = price;
        this.dateOfSale = dateOfSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "seller='" + seller + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", dateOfSale=" + dateOfSale +
                '}';
    }
}
