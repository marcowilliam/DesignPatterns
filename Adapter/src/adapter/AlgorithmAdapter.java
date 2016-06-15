package adapter;

import adaptee.NewAlgorithm;
import target.OldAlgorithm;

public class AlgorithmAdapter extends OldAlgorithm{
	
	NewAlgorithm newAlgorithm;
	
	public AlgorithmAdapter(){
		this.newAlgorithm = new NewAlgorithm();
		
	}
	
	public void controlEntry(){
		newAlgorithm.control(true);
	}
	
	public void controlExit(){
		newAlgorithm.control(false);
	}
	
	

}
