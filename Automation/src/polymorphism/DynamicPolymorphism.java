package polymorphism;

import oops.mobile;
import oops.smartphone;
import oops.telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		//in DynamicPolymorphism : while creating a object : obj of child class and reference of parent class
		//calling of overridden functions is resolved at run  time rather then compile time.
		
		//telephone phone = new mobile();
		//Object phone = new mobile();
		phone.calling();
		phone = new telephone();
		phone.calling();
		phone = new smartphone();
		phone.calling();

	}

}
