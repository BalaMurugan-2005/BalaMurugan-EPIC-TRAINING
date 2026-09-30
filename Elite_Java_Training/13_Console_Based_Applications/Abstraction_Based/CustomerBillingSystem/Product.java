public abstract class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateTotal(int quantity);
}

class Item extends Product {
    public Item(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateTotal(int quantity) {
        return price * quantity;
    }
}
