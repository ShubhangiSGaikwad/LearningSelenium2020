package constructor;

public class AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();
	    obj.publicFunction();
	    obj.privateFunction();
	    obj.noAccessModFunction();
	    obj.protectedFunction();
	    
	}
	
	private void privateFunction()
			{
				
			}
	
	public void publicFunction()
	{
	}
	
	
	void noAccessModFunction()
	{
	}
	
	protected void protectedFunction()
	{
		
	}
	
	
}
