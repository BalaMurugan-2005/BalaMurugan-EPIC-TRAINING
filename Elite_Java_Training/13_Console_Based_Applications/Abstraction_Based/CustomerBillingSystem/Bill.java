import java.util.Scanner;

public class Bill {
    String customerName;
    Cart cart;
    static Product[] products = new Product[100];
    static int productCount = 0;

    public Bill(String customerName, Cart cart) {
        this.customerName = customerName;
        this.cart = cart;
    }

    public static void addProduct(Product p) {
        products[productCount++] = p;
        System.out.println("Product added successfully.");
    }

    public static void displayProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].id + " - " + products[i].name + " - " + products[i].price);
        }
    }

    public static Product searchProduct(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].id == id) {
                return products[i];
            }
        }
        return null;
    }

    public void generateBill() {
        if (cart.itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nCustomer: " + customerName);
        for (int i = 0; i < cart.itemCount; i++) {
            System.out.println(cart.items[i].product.id + " - " + cart.items[i].product.name + " - " + cart.items[i].quantity + " - " + cart.items[i].getTotal());
        }
        System.out.println("Total Amount: " + cart.getTotal());
        System.out.println("Thank you!\n");

        cart.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        addProduct(new Item(101, "Apple", 50.0));
        addProduct(new Item(102, "Milk", 30.0));

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        Bill bill = new Bill(name, cart);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Add to Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Product Name: ");
                String pName = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                Product product = new Item(id, pName, price);
                addProduct(product);
                System.out.println();
            } else if (choice == 2) {
                displayProducts();
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Enter Product ID to search: ");
                int id = sc.nextInt();
                sc.nextLine();
                Product p = searchProduct(id);
                if (p != null) {
                    System.out.println("Found: " + p.id + " - " + p.name + " - " + p.price);
                } else {
                    System.out.println("Product not found.");
                }
                System.out.println();
            } else if (choice == 4) {
                System.out.print("Enter Product ID to add: ");
                int id = sc.nextInt();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();

                Product p = searchProduct(id);
                if (p != null) {
                    cart.addToCart(p, qty);
                } else {
                    System.out.println("Product not found.");
                }
                System.out.println();
            } else if (choice == 5) {
                cart.viewCart();
                System.out.println();
            } else if (choice == 6) {
                bill.generateBill();
            } else if (choice == 7) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
            }
        }

        sc.close();
    }
}
