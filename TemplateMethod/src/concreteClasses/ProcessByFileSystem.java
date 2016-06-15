package concreteClasses;

import abstractClass.Process;

public class ProcessByFileSystem extends Process{

	public ProcessByFileSystem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showData() {
		System.out.println("showing data by FileSystem");
		
	}

	@Override
	public void processData() {
		System.out.println("processing data by FileSystem");
		
	}

	@Override
	public void consultData() {
		System.out.println("consulting data by FileSystem");
		
	}

}
