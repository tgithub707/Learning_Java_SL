package sl_Learning;

public class Looping {
	 int First_Class = 800;
	 int pass_mark =300;
	//int maxnum = 20;
	 int maxnum;
	public static void main(String args[])throws Exception{
		
		Looping obj = new Looping();
		//obj.test_student_grade(991);
		//obj.test_student_grade(799);
		//obj.test_student_grade(200);
		obj.Test_Forloop(5);
		//obj.Test_Whileloop();
		
	}
	
/*public  void  test_student_grade(int Student_Marks) {
	if (Student_Marks >First_Class)
	{
		System.out.println("First class");
	}
	else if (Student_Marks <First_Class && Student_Marks> pass_mark) {
		System.out.println("Second class");
	}
	else {
		
	
		System.out.println("Fail");
	}
	
}*/
public void Test_Forloop(int maxnum) {
	for (int i=1;i<maxnum;i++)
		System.out.println(i);
	
	/*public void Test_Forloop(int maxnum) {
	for (int i=maxnum;i>1;i--)
		System.out.println(i);*/
	}
	
	/*public void Test_Whileloop() {
		int a = 5;
		while(a>1) {
			System.out.println(a);
			a--;
		
	}*/
	
}

