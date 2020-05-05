package practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("unused")
public class iterator {

	public static void main(String[] args) {
		Set<String> st1 = new HashSet<>();
		st1.add("A");
//			st1.add("B");
		st1.add("C");
		// st1.clear();
		for (String name : st1) {
			System.out.println(name);
		}
	}
}
