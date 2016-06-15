package test;

import adapter.AlgorithmAdapter;
import target.OldAlgorithm;

public class Test {

	public static void main(String[] args) {
		OldAlgorithm algorithm = new OldAlgorithm();
		
		algorithm.controlEntry();
		algorithm.controlExit();
		
		algorithm = new AlgorithmAdapter();
		algorithm.controlEntry();
		algorithm.controlExit();
		

	}

}
