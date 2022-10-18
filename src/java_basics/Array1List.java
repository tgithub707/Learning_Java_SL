package java_basics;

import java.util.ArrayList;
import java.util.List;

public class Array1List {
	public static void main (String args[]) {
		
		Array1List obj = new Array1List();
		obj.LearnArrayList();
		
			
	}

	public  void LearnArrayList()
	{
		
		List<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		obj1.add(6);
		obj1.add(7);
		obj1.add(8);
		
		//System.out.println(obj1);
		
		//obj1.add(3,100);
		//System.out.println(obj1);
		for(int i:obj1) {
			System.out.println(i);
			if (i==4) 
				break;
	}
	
	}

}
