/*class FoodOrder extends Thread {
    public void run() {
        System.out.println("Food Ordered");
    }
}
class FoodPrepare extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Food Is Preparing");
        } catch (InterruptedException e) {
            
        }
    }
}
class Foodispacked extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Food is Packed");
        } catch (InterruptedException e) {
            
        }
    }
}
class FoodIsSend extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Food is Sent");
        } catch (InterruptedException e) {
           
        }
    }
}
class Orderdelivered extends Thread {
    public void run() {
        System.out.println("Order Delivered");
    }
}
class Main {
    public static void main(String[] args) throws InterruptedException {

        FoodOrder order = new FoodOrder();
        FoodPrepare prepare = new FoodPrepare();
        Foodispacked packed = new Foodispacked();
        FoodIsSend send = new FoodIsSend();
        Orderdelivered delivered = new Orderdelivered();

        order.start();
        order.join();

        prepare.start();
        prepare.join();

        packed.start();
        packed.join();

        send.start();
        send.join();

        delivered.start();
        delivered.join();
    }
}
*/
class Order {
	synchronized void updateStatus(String status) {
		System.out.println(status);
	}
}
class FoodPreparation implements Runnable {
	Order order;
	FoodPreparation(Order order) {
		this.order = order;
	}
	public void run() {
		order.updateStatus("FOOD IS PREPARING");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		order.updateStatus("FOOD IS PACKED");
	}
}
class FoodDelivery extends Thread {
	Order order;
	FoodDelivery(Order order) {
		this.order = order;
	}
	public void run() {
		order.updateStatus("FOOD IS SENT");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		order.updateStatus("ORDER DELIVERED");
	}
}
public class Main {

	public static void main(String[] args) throws Exception {

		Order order = new Order();

		System.out.println("FOOD ORDERED");

		FoodPreparation preparation = new FoodPreparation(order);

		FoodDelivery delivery = new FoodDelivery(order);

		Thread t1 = new Thread(preparation);

		t1.start();

		t1.join();

		delivery.start();

		delivery.join();

		System.out.println("Thank you for ordering!");
	}
}


