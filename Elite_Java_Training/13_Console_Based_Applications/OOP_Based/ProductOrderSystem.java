
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int stock;

    Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class CartItem {
    int productId;
    String productName;
    double price;
    int quantity;

    CartItem(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Normal arrays instead of ArrayList
    static Product[] products = new Product[100];
    static CartItem[] cart = new CartItem[100];

    static int productCount = 0;
    static int cartCount = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       PRODUCT ORDER SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Add To Cart");
            System.out.println("7. View Cart");
            System.out.println("8. Remove From Cart");
            System.out.println("9. Update Cart Quantity");
            System.out.println("10. Place Order");
            System.out.println("11. Exit");
            System.out.println("=================================");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    viewProducts();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    updateProduct();
                    break;

                case 5:
                    deleteProduct();
                    break;

                case 6:
                    addToCart();
                    break;

                case 7:
                    viewCart();
                    break;

                case 8:
                    removeFromCart();
                    break;

                case 9:
                    updateCartQuantity();
                    break;

                case 10:
                    placeOrder();
                    break;

                case 11:
                    System.out.println("Application Closed!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // =====================================
    // ADD PRODUCT
    // =====================================

    static void addProduct() {

        System.out.println("\n--- ADD PRODUCT ---");

        if (productCount == products.length) {
            System.out.println("Product storage is full!");
            return;
        }

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        // Check duplicate ID
        if (findProduct(id) != -1) {
            System.out.println("Product ID already exists!");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock = sc.nextInt();
        products[productCount] =  new Product(id, name, price, stock);
        productCount++;
        System.out.println("Product added successfully!");
    }

    // =====================================
    // VIEW PRODUCTS
    // =====================================

    static void viewProducts() {

        System.out.println("\n--- ALL PRODUCTS ---");

        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }

        System.out.printf(
                "%-8s %-20s %-12s %-10s%n",
                "ID",
                "NAME",
                "PRICE",
                "STOCK"
        );

        System.out.println("-----------------------------------------------");

        for (int i = 0; i < productCount; i++) {

            System.out.printf(
                    "%-8d %-20s ₹%-11.2f %-10d%n",
                    products[i].id,
                    products[i].name,
                    products[i].price,
                    products[i].stock
            );
        }
    }

    // =====================================
    // SEARCH PRODUCT
    // =====================================

    static void searchProduct() {

        System.out.println("\n--- SEARCH PRODUCT ---");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int index = findProduct(id);

        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        Product p = products[index];

        System.out.println("\nProduct Found!");
        System.out.println("ID    : " + p.id);
        System.out.println("Name  : " + p.name);
        System.out.println("Price : ₹" + p.price);
        System.out.println("Stock : " + p.stock);
    }

    // =====================================
    // UPDATE PRODUCT
    // =====================================

    static void updateProduct() {

        System.out.println("\n--- UPDATE PRODUCT ---");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int index = findProduct(id);

        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        Product p = products[index];

        sc.nextLine();

        System.out.print("Enter New Name: ");
        p.name = sc.nextLine();

        System.out.print("Enter New Price: ");
        p.price = sc.nextDouble();

        System.out.print("Enter New Stock: ");
        p.stock = sc.nextInt();

        System.out.println("Product updated successfully!");
    }

    // =====================================
    // DELETE PRODUCT
    // =====================================

    static void deleteProduct() {

        System.out.println("\n--- DELETE PRODUCT ---");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int index = findProduct(id);

        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        // Shift elements to left
        for (int i = index; i < productCount - 1; i++) {

            products[i] = products[i + 1];
        }

        products[productCount - 1] = null;

        productCount--;

        System.out.println("Product deleted successfully!");
    }

    // =====================================
    // ADD TO CART
    // =====================================

    static void addToCart() {

        System.out.println("\n--- ADD TO CART ---");

        if (cartCount == cart.length) {
            System.out.println("Cart is full!");
            return;
        }

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int productIndex = findProduct(id);

        if (productIndex == -1) {
            System.out.println("Product not found!");
            return;
        }

        Product p = products[productIndex];

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        if (quantity > p.stock) {
            System.out.println(
                    "Only " + p.stock + " items available!"
            );
            return;
        }

        // Check if product already exists in cart
        int cartIndex = findCartItem(id);

        if (cartIndex != -1) {

            if (cart[cartIndex].quantity + quantity > p.stock) {
                System.out.println("Not enough stock!");
                return;
            }

            cart[cartIndex].quantity += quantity;

        } else {

            cart[cartCount] = new CartItem(
                    p.id,
                    p.name,
                    p.price,
                    quantity
            );

            cartCount++;
        }

        System.out.println("Product added to cart!");
    }

    // =====================================
    // VIEW CART
    // =====================================

    static void viewCart() {

        System.out.println("\n=================================");
        System.out.println("              CART");
        System.out.println("=================================");

        if (cartCount == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        double subtotal = 0;

        System.out.printf(
                "%-8s %-15s %-10s %-8s %-12s%n",
                "ID",
                "PRODUCT",
                "PRICE",
                "QTY",
                "TOTAL"
        );

        System.out.println(
                "------------------------------------------------"
        );

        for (int i = 0; i < cartCount; i++) {

            double total = cart[i].getTotal();

            subtotal += total;

            System.out.printf(
                    "%-8d %-15s ₹%-9.2f %-8d ₹%-11.2f%n",
                    cart[i].productId,
                    cart[i].productName,
                    cart[i].price,
                    cart[i].quantity,
                    total
            );
        }

        double discount = calculateDiscount(subtotal);

        double afterDiscount = subtotal - discount;

        double tax = afterDiscount * 0.18;

        double grandTotal = afterDiscount + tax;

        System.out.println(
                "------------------------------------------------"
        );

        System.out.printf(
                "Subtotal    : ₹%.2f%n",
                subtotal
        );

        System.out.printf(
                "Discount    : ₹%.2f%n",
                discount
        );

        System.out.printf(
                "Tax (18%%)    : ₹%.2f%n",
                tax
        );

        System.out.println(
                "------------------------------------------------"
        );

        System.out.printf(
                "GRAND TOTAL  : ₹%.2f%n",
                grandTotal
        );
    }

    // =====================================
    // REMOVE FROM CART
    // =====================================

    static void removeFromCart() {

        System.out.println("\n--- REMOVE FROM CART ---");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int index = findCartItem(id);

        if (index == -1) {
            System.out.println("Product not found in cart!");
            return;
        }

        // Shift elements
        for (int i = index; i < cartCount - 1; i++) {

            cart[i] = cart[i + 1];
        }

        cart[cartCount - 1] = null;

        cartCount--;

        System.out.println("Product removed from cart!");
    }

    // =====================================
    // UPDATE CART QUANTITY
    // =====================================

    static void updateCartQuantity() {

        System.out.println("\n--- UPDATE CART QUANTITY ---");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        int cartIndex = findCartItem(id);

        if (cartIndex == -1) {
            System.out.println("Product not found in cart!");
            return;
        }

        System.out.print("Enter New Quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        int productIndex = findProduct(id);

        if (quantity > products[productIndex].stock) {

            System.out.println(
                    "Only " +
                    products[productIndex].stock +
                    " items available!"
            );

            return;
        }

        cart[cartIndex].quantity = quantity;

        System.out.println("Cart quantity updated!");
    }

    // =====================================
    // PLACE ORDER
    // =====================================

    static void placeOrder() {

        System.out.println("\n--- PLACE ORDER ---");

        if (cartCount == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        double subtotal = 0;

        for (int i = 0; i < cartCount; i++) {

            subtotal += cart[i].getTotal();
        }

        double discount = calculateDiscount(subtotal);

        double afterDiscount = subtotal - discount;

        double tax = afterDiscount * 0.18;

        double grandTotal = afterDiscount + tax;

        // Reduce stock
        for (int i = 0; i < cartCount; i++) {

            int productIndex =
                    findProduct(cart[i].productId);

            products[productIndex].stock -=
                    cart[i].quantity;
        }

        System.out.println("\n=================================");
        System.out.println("          ORDER BILL");
        System.out.println("=================================");

        for (int i = 0; i < cartCount; i++) {

            System.out.printf(
                    "%-15s x%-5d ₹%.2f%n",
                    cart[i].productName,
                    cart[i].quantity,
                    cart[i].getTotal()
            );
        }

        System.out.println("---------------------------------");

        System.out.printf(
                "Subtotal    : ₹%.2f%n",
                subtotal
        );

        System.out.printf(
                "Discount    : ₹%.2f%n",
                discount
        );

        System.out.printf(
                "Tax (18%%)    : ₹%.2f%n",
                tax
        );

        System.out.println("---------------------------------");

        System.out.printf(
                "GRAND TOTAL : ₹%.2f%n",
                grandTotal
        );

        System.out.println("=================================");

        // Empty cart after order
        for (int i = 0; i < cartCount; i++) {
            cart[i] = null;
        }

        cartCount = 0;

        System.out.println("Order placed successfully!");
    }

    // =====================================
    // FIND PRODUCT
    // =====================================

    static int findProduct(int id) {

        for (int i = 0; i < productCount; i++) {

            if (products[i].id == id) {
                return i;
            }
        }

        return -1;
    }

    // =====================================
    // FIND CART ITEM
    // =====================================

    static int findCartItem(int id) {

        for (int i = 0; i < cartCount; i++) {

            if (cart[i].productId == id) {
                return i;
            }
        }

        return -1;
    }

    // =====================================
    // DISCOUNT
    // =====================================

    static double calculateDiscount(double subtotal) {

        if (subtotal >= 10000) {
            return 1000;
        }

        if (subtotal >= 5000) {
            return 500;
        }

        if (subtotal >= 2000) {
            return 200;
        }

        return 0;
    }
}
