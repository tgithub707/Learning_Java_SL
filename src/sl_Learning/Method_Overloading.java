package sl_Learning;

public class Method_Overloading {
	
	public static void main(String args[])throws Exception{
		
		Method_Overloading obj = new Method_Overloading();
		obj.addition();
		obj.addition(10, 20);
		obj.addition(10, 20, 30);
	}

	public void addition() {
		System.out.println("this is an example for method overloading");
		
	}
public void addition(int a , int b) {
	int c= a+b;
		System.out.println("sum of a,b = " +c);
	}

public void addition(int a , int b, int c) {
	int d= a+b+c;
	System.out.println("sum of a,b,c = " +d);
	
}
}
