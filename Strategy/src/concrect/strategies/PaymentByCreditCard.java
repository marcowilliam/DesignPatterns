package concrect.strategies;

import Context.Payment;

public class PaymentByCreditCard implements Payment{

	public PaymentByCreditCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay(Double amount) {
		System.out.println("Paying " + amount + " with credit card");
	}

}
