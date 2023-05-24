package apis;

import java.util.HashMap;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
        map.put("manju","cse");
        map.put("prudhvi","cse");
        map.put("vardhan","cse");
        
        System.out.println(map);
        
        Set<String> str = map.keySet();
        
        System.out.println(str);
        
        //str.toArray();
        
        HashMap<String,HashMap<String,HashMap<String,String>>> demo = new HashMap<>();
        demo.put("Modern C++ Security", new HashMap<String,HashMap<String,String>>());
        
        System.out.println(demo);
        
        System.out.println(System.getProperty("user.dir"));
        
	}
}
