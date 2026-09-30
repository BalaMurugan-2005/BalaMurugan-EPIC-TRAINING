import java.util.*;

abstract class Payment {
	int customerId;
	String customerName;
	int amount;
	Payment(int customerId, String customerName, int amount) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.amount = amount;
	}
	abstract int transaction();
	
}
class CardTransaction extends Payment {
	CardTransaction(int customerId, String customerName, int amount) {
		super(customerId, customerName, amount);
	}
	int transaction() {
		int transactionFee = amount * 2 / 100;
		int cashBack = amount * 5 / 100;

		return amount + transactionFee - cashBack;
	}
}
class UPITransaction extends Payment {
	UPITransaction(int customerId, String customerName, int amount) {
		super(customerId, customerName, amount);
	}
	int transaction() {
		int transactionFee = amount * 5 / 1000;
		int cashBack = amount * 2 / 100;

		return amount + transactionFee - cashBack;
	}
}
class NetBanking extends Payment {
	NetBanking(int customerId, String customerName, int amount) {
		super(customerId, customerName, amount);
	}
	int transaction() {
		int transactionFee = amount * 1 / 100;
		int cashBack = amount * 1 / 100;

		return amount + transactionFee - cashBack;
	}
}
public class Main {
	public static void main(String[] args) {
		Payment p1 = new CardTransaction(101, "Bala", 1000);
		Payment p2 = new UPITransaction(102, "michel", 1000);
		Payment p3 = new NetBanking(103, "goutham", 1000);
		System.out.println(p1.transaction());
		System.out.println(p2.transaction());
		System.out.println(p3.transaction());
	}
}