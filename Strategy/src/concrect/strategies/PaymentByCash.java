package concrect.strategies;

import Context.Payment;

public class PaymentByCash implements Payment{

	public PaymentByCash() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay(Double amount) {
		System.out.println("Paying " + amount + " with cash!");
		
	}

}
