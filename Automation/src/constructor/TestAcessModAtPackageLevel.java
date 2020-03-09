package constructor;

public class TestAcessModAtPackageLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AccessModifier obj = new AccessModifier();
        obj.publicFunction();
        obj.noAccessModFunction();
    //    obj.privateFunction(); //
        obj.protectedFunction();	
        
        System.out.println("Main");
	}

}
