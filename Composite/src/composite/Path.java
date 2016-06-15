package composite;

import java.util.ArrayList;

import component.Stretch;

public class Path implements Stretch{
	
	ArrayList<Stretch> stretches;
	
	public Path(){
		this.stretches = new ArrayList<Stretch>();
	}
	
	public void addStretch(Stretch stretch){
		this.stretches.add(stretch);
	}

	public void removeStretch(Stretch stretch){
		this.stretches.remove(stretch);
	}
	@Override
	public void printStretch() {
		for(int i=0; i<this.stretches.size(); i++){
			stretches.get(i).printStretch();	
		}
		
	}

}
