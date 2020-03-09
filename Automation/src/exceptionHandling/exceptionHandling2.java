package exceptionHandling;

import constructor.Car;

public class exceptionHandling2 {

	public static Car car;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println((10 / 2));
			String str = "shubhangi";
			System.out.println(str.charAt(3));
			car.features();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/*
	 * try {
	 * 
	 * 
	 * }
	 */

}
