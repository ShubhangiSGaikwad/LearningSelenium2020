import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayList
		List<String> list = new ArrayList<String>();
		//default size of ArrayList is 10
		
		list.add("Shubhangi");
		list.add("Gaikwad");
		list.add("Gaikwad"); // list allows duplicate data
		list.add("Pune");
		
		
		//enhanced for loop 
		
		for(String s : list)
			
		{
			System.out.println("ArrayLIst :" +s);
		}
		
		//LinkedList
		
		
		list = new LinkedList<>();
		//default size of ArrayList is 10
		
		list.add("Shubhangi LinkedList");
		list.add("Gaikwad LinkedList");
		list.add("Pune LinkedList");
		
		

		for(String s : list)
			
		{
			System.out.println("LinkedList :" +s);
		}
				

		list = new Vector<>();
		//default size of ArrayList is 10
		
		list.add("Shubhangi Vector");
		list.add("Gaikwad Vector");
		list.add("Pune Vector");
		
		

		for(String s : list)
			
		{
			System.out.println("Vector :" +s);
		}
				

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
