package singleton;

public class DataBase {
	private static DataBase instance;
	
	public DataBase(){
		
	}
	
	public static synchronized DataBase getInstance(){
		if (DataBase.instance==null){
			DataBase.instance = new DataBase();
			System.out.println("creating database");
			
		}
		else{
			System.out.println("database already created");
		} 
		
		return DataBase.instance;
		
	} 
}
