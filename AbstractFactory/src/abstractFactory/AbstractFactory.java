package abstractFactory;

import Configuration.Configuration;
import concreteFactories.MasterCardFactory;
import concreteFactories.VisaFactory;
import productA.Receptor;
import productB.Issuing;

public abstract class AbstractFactory {

	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Issuing createEmissor();
	
	public abstract Receptor createReceptor();
	
	public static AbstractFactory defineFactory(){
		if(Configuration.getCurrentCardType() == "Visa"){
			return new VisaFactory();
		}
		else{
			return new MasterCardFactory();
		}
	}

}
