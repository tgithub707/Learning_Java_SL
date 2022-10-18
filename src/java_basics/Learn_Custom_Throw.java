package java_basics;

public class Learn_Custom_Throw {
	
	public static void main(String args[]) {
		
		Learn_Custom_Throw  obj = new Learn_Custom_Throw();
		
		
		obj.Delhi_Public_School_Admission(9);
		
	}
	
	
	public void Delhi_Public_School_Admission(int Student_Age) {
		
	if(Student_Age>10) {
		
		throw new ArithmeticException("sorry your kid is not eligible for the Admission");
		
	}
		
		if(Student_Age<10) {
			System.out.println("welcome to School");
		}
	}
	
	
	
	

}
