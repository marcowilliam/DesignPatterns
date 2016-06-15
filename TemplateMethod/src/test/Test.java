package test;

import concreteClasses.ProcessByDataBase;
import concreteClasses.ProcessByFileSystem;
import abstractClass.Process;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Process process1 = new ProcessByDataBase();
		Process process2 = new ProcessByFileSystem();
		
		process1.templateMethod();
		process2.templateMethod();

	}

}
