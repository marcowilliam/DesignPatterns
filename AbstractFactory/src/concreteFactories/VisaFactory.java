package concreteFactories;

import abstractFactory.AbstractFactory;
import productA.Receptor;
import productA.ReceptorVisa;
import productB.Issuing;
import productB.IssuingVisa;

public class VisaFactory extends AbstractFactory{

	public VisaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Issuing createEmissor() {
		return new IssuingVisa();
		
	}

	@Override
	public Receptor createReceptor() {
		return new ReceptorVisa();
		
	}

}
