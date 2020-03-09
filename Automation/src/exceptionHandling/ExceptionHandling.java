package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println((10 / 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	
	
	try {
		String str ="shubhangi";
		System.out.println(str.charAt(10));
		
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
}

}