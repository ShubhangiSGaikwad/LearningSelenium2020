package constructor;

public class Car {
	
	String colour;
	String model;
    static int  wheels=4;
	//int  wheels=4;
	
	
	
	// variables  within the class ans  outside the method is global variables.
	public void features()
	{
	//	System.out.println("Congrats for your new 4 wheeeler , model in white colour");
		
		System.out.println("Congrats for your new "+wheels+", wheeeler "+model+" model in "+colour+" colour");
	}
	
	
	public Car()
	{
	
	}
	
	
	public Car (String colour , String model)
	{
		this.colour=colour;
		this.model=model;
		
	}
	
	
	
	
	

}
