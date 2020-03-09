package exceptionHandling;

import constructor.Car;

public class exceptionHandling4 {

	public static Car car;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println((10 / 2));
			Thread.sleep(3000);
			String str = "shubhangi";
			System.out.println(str.charAt(3));
			car.features();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());

				}
		finally { System.out.println("Finally block");}

	}

	/*
	 * try {
	 * 
	 * 
	 * }
	 */

}
