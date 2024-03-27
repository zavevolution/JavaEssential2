package dz7.task3;

public class Price implements Comparable<Price> {
    String productName;
    String storeName;
    double productPrice;

    public Price(String productName, String storeName, double productPrice) {
        this.productName = productName;
        this.storeName = storeName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Price o) {
        return this.storeName.compareTo(o.storeName);
    }

    @Override
    public String toString() {
        return "Price{" +
                "назва товару='" + productName + '\'' +
                ", назва магазину='" + storeName + '\'' +
                ", ціна товару=" + productPrice +
                '}';
    }
}
