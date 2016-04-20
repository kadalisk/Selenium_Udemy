package suresh;

public class Basics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I navigated to home page");

		//To call a method from other class first define a object for the child class
		//and use the below syntax
		//classobject.methodname
		
		Methods m = new Methods();

		//m.ValidateHeader();
		
		System.out.println(m.ValidateHeader());
		

	}

}
