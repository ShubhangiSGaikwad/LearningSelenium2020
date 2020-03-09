package function;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1, add2, add3, add4;

		System.out.println("Function with no variable sum()");
		sum(); // function defintion in same class

		System.out.println("Function with two variable sum(int a, int b)");
		sum(10, 20);
		sum(100, 200);
		sum(20, 30);

		System.out.println("Function with three variable sum(int a, int b ,int c)");
		add4 = sum(30, 40, 30);
		System.out.println("a+b+c:" + add4);

		// add.sum(); // different way of calling function , if the function is in class
	}

	public static void sum()  {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void sum(int a, int b) {

		System.out.println(a + b);
	}

	//
	public static int sum(int a, int b, int c) {
		return a + b + c;
		// System.out.println(a+b);
	}
	
	
//}

/*public static void main(String[] args) {
      String name=getName("Hazel");
      System.out.println(name);
      
      String name1=getName("Dhairya",7);
      // age=getName(20);
      System.out.println(name1);
      //System.out.println(age);
}

public static String getName(String name) {
	return ("Your Name is " +name);
	
}

public static String getName(String name1 , int age) {
	return ("Your Name and age is " +name1 +age);
	//return ("Your Name is " +age);
	
}*/



}
