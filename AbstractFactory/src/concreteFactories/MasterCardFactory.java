package concreteFactories;

import abstractFactory.AbstractFactory;
import productA.Receptor;
import productA.ReceptorMasterCard;
import productB.Issuing;
import productB.IssuingMasterCard;

public class MasterCardFactory extends AbstractFactory{

	public MasterCardFactory(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public Issuing createEmissor() {
		return new IssuingMasterCard();
		
	}

	@Override
	public Receptor createReceptor() {
		return new ReceptorMasterCard();
		
	}

}
