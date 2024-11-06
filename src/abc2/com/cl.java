package abc2.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class cl {
	public static void main(String[] args) {
		
	
	Map<Integer, String>le = new LinkedHashMap<Integer, String>();
	
	le.put(100, "gopal");
	le.put(200, "vopal");
	le.put(300, "lopal");
	le.put(400, "popal");
	le.put(500, "qopal");
	
	int size = le.size();
	System.out.println(size);
	
	String string = le.get(200);
	
	System.out.println(string);
	
	
	
	
	
	
}

	
	

}