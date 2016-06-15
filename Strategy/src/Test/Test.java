package Test;

import Context.Payment;
import Strategy.ShoppingContext;
import concrect.strategies.PaymentByCash;
import concrect.strategies.PaymentByCreditCard;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ShoppingContext shopping = new ShoppingContext();
		Payment payment;
		
		payment = new PaymentByCreditCard();
		shopping.pay(payment);
		payment = new PaymentByCash();
		shopping.pay(payment);

	}

}
