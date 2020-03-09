import java.util.Map;
import java.util.HashMap;


public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map= new HashMap<>();
		
		map.put(1, "ABCD");
		map.put(2, "DEFG");
		map.put(3, "HIJK");
		
		
		System.out.println("MAP "+ map.get(2));
		
		
		
		
	}

}
