package abstractClass;

public abstract class Process {

	public Process() {
		// TODO Auto-generated constructor stub
	}
	
	public void templateMethod(){
		this.consultData();
		this.processData();
		this.showData();
		
	}

	public abstract void showData();

	public abstract void processData();

	public abstract void consultData();

}
