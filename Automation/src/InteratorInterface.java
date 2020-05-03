import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Set<String> st1 = new HashSet<>();

		
		st1.add("SameerG");
		st1.add("Wadgaonsheri Pune");
		st1.add("Pune 414");
		//st1.clear();
		
		Iterator<String> it = st1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}*/

		Set<String> st1 = new HashSet<>();
		st1.add("A");
		st1.add("B");
		st1.add("C");
		//st1.clear();
		for(String name: st1){
			System.out.println(name);			
		}	
	}
}


