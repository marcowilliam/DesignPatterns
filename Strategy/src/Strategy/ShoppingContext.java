package Strategy;

import Context.Payment;

public class ShoppingContext {
	
	Payment payment;
	Double amount;

	public ShoppingContext() {
		this.amount = 99.90;
	}
	
	public void pay(Payment payment){
		this.payment = payment;
		this.payment.pay(amount);
	}	

}
