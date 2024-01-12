package in.co.rays.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
    public class TestMap {
	public static void main(String[] args) {
		Map map= new HashMap();
		map.put(1,"pooja");
		map.put(2, "ten");
		map.put(3,"laxman");
		map.put(4,"five");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Object object:map.keySet()) {
			System.out.println(object);
		}
		for (Object object:map.values()) {
			System.out.println(object);
			
		}
		
		}
		
		
		
	}


