package singleton;

public class DataBase {
	private static DataBase instance;
	
	private DataBase(){
		
	}
	
	public static synchronized DataBase getInstance(){
		if (instance==null){
			initializeInstance();
			System.out.println("creating database");
			
		}
		else{
			System.out.println("database already created");
		} 
		
		return instance;
	} 
	
	private static synchronized void initializeInstance(){
		if (instance==null){
			instance = new DataBase();	
		}
	}

	
	
}
