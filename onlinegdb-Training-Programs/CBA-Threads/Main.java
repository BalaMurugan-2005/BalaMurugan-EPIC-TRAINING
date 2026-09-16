class Order {
	synchronized void updateStatus(String status) {
		System.out.println(status);
	}
}
class PaymentProcessing implements Runnable {
	Order order;
	PaymentProcessing(Order order) {
		this.order = order;
	}
	public void run() {
		order.updateStatus("PAYMENT PROCESSING");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);

			order.updateStatus("PAYMENT COMPLETED");
		}
	}
	class FoodDelivery extends Thread {
		Order order;
		FoodDelivery(Order order) {
			this.order = order;
		}
		public void run() {
			order.updateStatus("ORDER IS BEING SHIPPED");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			order.updateStatus("ORDER DELIVERED");
		}
	}
	public class Main {
		public static void main(String[] args) throws Exception {
			Order order = new Order();
			System.out.println("ORDER PLACED");
			PaymentProcessing pay = new PaymentProcessing(order);
			FoodDelivery delivery = new FoodDelivery(order);
			Thread t1 = new Thread(pay);
			t1.start();
			t1.join();
			delivery.start();
			delivery.join();
			System.out.println("Thank you for ordering");
		}
	}