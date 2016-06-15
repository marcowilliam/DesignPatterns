package Test;

import composite.Path;
import leaf.StretchByCar;
import leaf.StretchByFoot;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StretchByFoot stretchByFoot1 = new StretchByFoot();
		StretchByFoot stretchByFoot2 = new StretchByFoot();
		StretchByCar stretchByCar = new StretchByCar();
		Path path1 = new Path();
		Path path2 = new Path();
		
		path1.addStretch(stretchByCar);
		path1.addStretch(stretchByFoot1);
		path2.addStretch(path1);
		path2.addStretch(stretchByFoot2);
		
		System.out.println("path 1:");
		path1.printStretch();
		System.out.println("path 2:");
		path2.printStretch();

	}

}
