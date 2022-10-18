package sl_Learning;

public class Variable_Learning {
	int roll = 10;
	String book;
	public static void main(String args[]) {
		
		Variable_Learning obj = new Variable_Learning();
		
		
		System.out.println(obj.addition_numbers(10,20,30));
		System.out.println(obj.FullName("Anu","Kodali"));
		System.out.println(obj.book);
	}
	
// Construction - doesn't return any value , same class name. Once we create an object a default construction is automatically called.
	//tpyes of constructiors - Default, 
	public Variable_Learning() {
		System.out.println(" this is constructor");
		this.book = "Let us C";
	}
	
	
	
	public void Addition() {
		int empNo = 12345;
		System.out.println(roll);
		System.out.println(empNo);
		
	}

	public void Sub() {
		System.out.println(roll);
		//System.out.println(empNo);
	
	}
	
	/*public static int addition_numbers(int x , int b, int c) {
		return x+b+c;
	}*/
	public static int addition_numbers(int x , int b, int c) {
		return x+b+c;
	}
	
	
	public String FullName(String FName, String LName) {
		return FName +" " + LName;
	}
}
// method level variables can be accessed only by that method. Class level variable can used in any method/s