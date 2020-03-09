//inhertance
package oops;

public class mobile extends telephone {

	public void texting()
	{
		System.out.println("Mobile:Texting");
	}
	
	//multiple inheritance
	
	//same name methods in child and parent it is case of overriding method.with same number of parameters.
	//same name methods in child and parent it is case of overloading method.with different number of parameters.
	public void calling()
	{
		System.out.println("2.Calling from mobile");
	}

}
