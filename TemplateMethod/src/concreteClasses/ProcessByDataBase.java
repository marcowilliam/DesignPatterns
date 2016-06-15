package concreteClasses;

import abstractClass.Process;

public class ProcessByDataBase extends Process{

	public ProcessByDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showData() {
		System.out.println("showing data by DataBase");
		
	}

	@Override
	public void processData() {
		System.out.println("processing data by DataBase");		
	}

	@Override
	public void consultData() {
		System.out.println("consulting data by DataBase");		
	}

}
