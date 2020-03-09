package function;

public class NonStaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 NonStaticFunction a = new NonStaticFunction();
 
 // like int a =
 
 int sum = a.sum(10,20);
 
		System.out.println(sum);
	}
	
	public int sum (int a , int b)
	{
	
	return a+b;	
	
	}

}
