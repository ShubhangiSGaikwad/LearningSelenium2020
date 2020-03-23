package fibonnacciseries;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// adding of previous 2 numbers

		int a = 0, b = 1, c;

		for (int i = 1; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.println("Value of c :" + c);
		}
	}

}
