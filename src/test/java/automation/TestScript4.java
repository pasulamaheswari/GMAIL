package automation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestScript4 {

	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<String, String>();
		
		//Map<String,String>map2 = new TreeMap<String, String>();
		
		//Map<String,String>map3 = new Hashtable<String, String>();
		
		map.put("TestScript","TC001");
		
		map.put("UserName","Admin");
		
		map.put("Password","Admin123");
		
		System.out.println(map.get("UserName"));
		
		System.out.println(map);
		
		System.out.println("Password");
		
		System.out.println(map);
	
	}

}
