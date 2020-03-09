package exceptionHandling;

import function.add;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//static function are called through classname.
		//nonstatic function through creating object
		
	add.sum();
	Thread.sleep(8000);
	add.sum();
	
	
	}

}
