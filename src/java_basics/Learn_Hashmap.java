package java_basics;

import java.util.HashMap;

public class Learn_Hashmap {
	
	public static void main(String args[])throws Exception
	{
		
		Learn_Hashmap obj =new Learn_Hashmap();
		obj.Implement_Hashmap();
		
	}
	
	public void Implement_Hashmap() {
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(1, "anu");
		HM.put(2, "M");
		HM.put(3, "H");
		HM.put(4, "V");
		//System.out.println(HM.get(2));
		//System.out.println(HM);
		
		for(int i:HM.keySet()) {
			System.out.println(HM.get(i));
			
			
		}
		
		
	}
	
	
	
	
	
	

}
