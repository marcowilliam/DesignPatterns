package Test;

import abstractFactory.AbstractFactory;
import productA.Receptor;
import productB.Issuing;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.defineFactory();
		
		Issuing issuing = factory.createEmissor();
		Receptor receptor = factory.createReceptor();
		
		issuing.issue();
		receptor.receive();
		

	}

}
