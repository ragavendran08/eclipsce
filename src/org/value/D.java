package org.value;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class D {
	
	public static void main(String[] args) {
		C fb= new C();
		fb.setUsername("facebook");
		fb.setPassword("facebook");
		
		C in = new C();
		in.setUsername("insta");
		in.setPassword("insta");
		
		Map<C, Integer> id=new LinkedHashMap<C, Integer>();
		id.put(fb, 1);
		id.put(in, 2);
		
		Set<Entry<C,Integer>> entrySet = id.entrySet();
		for (Entry<C, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getUsername());
			System.out.println(entry.getKey().getPassword());
		}
		
		
		
		
		
	}
	

}
