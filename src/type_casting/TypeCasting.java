package type_casting;

public class TypeCasting {
	
	public static int num = 10;
	//public static float sal = 100.4f;
	public  static void main(String args[]) throws Exception {
		
		System.out.println("The integer is  " +num);
		double numDB = num;
		System.out.println("Integer to Double TypeCasting " + numDB);
		//System.out.println(int(sal));
		TypeCasting obj = new TypeCasting();
		obj.DoubleToInt();
		obj.IntToString();
		obj.StringToInt();
		
		
		
	}
	
	
	public void DoubleToInt() {
		
		double abc = 5.5;
		int i = (int)abc;
		System.out.println("print only integer part " +i);
		System.out.println("print double value " + abc );
	}
	
public void IntToString() {
		
		int money = 70;
		String i = Integer.toString(money);
		System.out.println("print integer  " +i);
		System.out.println("print string value of the Integer" + i);
	}


public void StringToInt() {
	
	String str = "123";
	int i = Integer.parseInt(str);
	int j= 10;
	int k = i+j;
	System.out.println("print string  " +str);
	System.out.println("print string value of the Integer" + k);
}
}
