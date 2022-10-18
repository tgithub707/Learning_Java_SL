package java_basics;

public class ExceptionHandling {
	public String applicationURL = "https://www.google.com";
	
	public static void main (String args[]) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.dosomeoperations();
		
	}
	
	
	public void dosomeoperations() {
		try {
		int a = 100/0;
		}
		catch(Exception e) {
			System.out.println("error");
		}
		finally{
			System.out.println("Closing the app");
		}
			
		System.out.println(applicationURL.length());
		System.out.println("these are my next scripts");
	}
	
	public void doGoogleHomePageHeaderValidation() {
		try {
			
		}
		
		catch(Exception e) {e.printStackTrace();{
			System.out.println("");
		}
		
		}
	}
	
	

}
