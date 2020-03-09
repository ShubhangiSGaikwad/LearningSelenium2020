import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class InteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<String> set = new HashSet<>();

set.add("ABCD");
set.add("Sameer");
set.add("Gaikwad"); 
set.add("Pune");
	
Iterator<String> it =set.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
