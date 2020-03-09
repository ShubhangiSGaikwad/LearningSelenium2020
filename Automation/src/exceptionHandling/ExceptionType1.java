package exceptionHandling;

import constructor.Car;

public class ExceptionType1 {
	
	//public static Car car ; // reference of class
	 public static Car car = new Car() ; // reference of class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/2);
		
		//Exception 
		//Type1 :ArithmeticException 
		
		//System.out.println(10/0);
		
		//Type2 :StringIndexoutof bound Exception
		//String name ="shubhangi";
		//System.out.println(name.charAt(10));
		
		//Type 3:
		car.features();
		

	}

}
