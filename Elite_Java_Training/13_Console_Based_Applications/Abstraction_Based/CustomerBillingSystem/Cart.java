class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.calculateTotal(quantity);
    }
}

public class Cart {
    CartItem[] items = new CartItem[100];
    int itemCount = 0;

    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].product.id == product.id) {
                items[i].quantity += quantity;
                System.out.println("Updated " + product.name + " quantity to " + items[i].quantity);
                return;
            }
        }
        items[itemCount++] = new CartItem(product, quantity);
        System.out.println("Added " + product.name + " to cart.");
    }

    public void viewCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].product.id + " - " + items[i].product.name + " - " + items[i].quantity + " - " + items[i].getTotal());
        }
        System.out.println("Total: " + getTotal());
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotal();
        }
        return total;
    }

    public void clear() {
        itemCount = 0;
    }
}
