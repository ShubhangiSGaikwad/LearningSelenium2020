package stringFunctions;

public class stringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "shubhangi";
		// Function1
		System.out.println(name.length());

		// Function2
		System.out.println(name.charAt(4));

		// Function3
		String name1 = "shubhangi";
		System.out.println(name.equals(name1));

		// Function4
		String name2 = "sHubhangi";
		System.out.println(name.equalsIgnoreCase(name1));

		// Function5
		String temp = "shubhangi gaikwad";
		// temp.split(" "); split by space
		String[] arr = temp.split(" ");
		for (String s : arr) {

			System.out.println(s);

		}

		// Function5
		String temp1 = "shubhangi gaikwad";
		System.out.println(temp1.substring(2));
		System.out.println(temp1.substring(2, 5)); // first and one less then the last one

		// Function56
		System.out.println(temp1.replace(" ", "_"));

		// Function7
		String temp2 = " _shubhangi gaikwad_ ";
		System.out.println(temp2.trim());

		// Function8
		String temp3 = " _ShUbhangi GaiKwad_ ";
		System.out.println(temp3.toLowerCase());
		System.out.println(temp3.toUpperCase());

		// System.out.println(name.charequal(n));

		// Function9

		String[] str = new String[3];
		str[0] = "Shubhangi";
		for (int i = 0; i <=str.length; i++) {
			if (str[i]=='n') {
				System.out.println("it contains n ");
			}

			System.out.println("does not contains n ");

			// System.out.println(temp2.trim());

		}

	}

}
