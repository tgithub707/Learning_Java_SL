package test_A;

public class Test1A {
	
	static int a =10;
	static int b = 20;
	public static void main(String args[])  throws Exception {
		Test1A obj = new Test1A();
		obj. doAddition();
		obj.doSub();
		//doAddition();
		//doSub();
		//System.out.println(obj.a);
		
	}

	
	public  static void doAddition() {
	
		int c = a+b;
		
		System.out.println("I am doing addition");
		System.out.println(c);
	}
	
	public  static void doSub() {
		
		int c = b-a;
		
		System.out.println("I am doing substraction");
		System.out.println(c);
	}
	
}
// Always use non static methods in Automation