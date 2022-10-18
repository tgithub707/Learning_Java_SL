package sl_Learning;

public class Args_Constructor {
	int empId ;
	String EName;
	
	public Args_Constructor(int employeeid, String EmployeeName) {
		
		this.empId = employeeid;
		this.EName = EmployeeName;
		
	}
	
	public  void EmployeeInfo() {
		System.out.println("Employee ID : "+ empId +" Employee Name: "+ EName);
	}
	
	
	public static void main(String args[]) throws Exception {
		
		Args_Constructor obj = new Args_Constructor(12,"ANU");
		obj.EmployeeInfo();
		
	}
	

}
