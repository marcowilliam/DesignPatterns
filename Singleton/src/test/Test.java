package test;

import singleton.DataBase;

public class Test {

	public static void main(String[] args) {
		
		DataBase dataBase;
		dataBase = DataBase.getInstance();
		
		DataBase dataBase2;
		dataBase2 = DataBase.getInstance();
		
		DataBase dataBase3;
		dataBase2 = DataBase.getInstance();

	}

}
