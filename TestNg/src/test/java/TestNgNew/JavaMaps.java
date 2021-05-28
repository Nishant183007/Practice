package TestNgNew;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps {

	public static void main(String[] args) {
		//HashMap - Order is based on Key ascending order
		//LinkedHashMap--- Insertion Order is preserved
		//TreeMap - Order is based on Key ascending order
		
		
		HashMap<Integer,String> hm = new HashMap();
		hm.put(7, "Dhoni");
		hm.put(8, "Jadeja");
		hm.put(3, "Raina");
		System.out.println(hm);
		for(Map.Entry m : hm.entrySet())
		{
		System.out.println(m.getKey()+">>>"+m.getValue());	
		}
		
		
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap();
		lhm.put(7, "Dhoni");
		lhm.put(8, "Jadeja");
		lhm.put(3, "Raina");
		System.out.println(lhm);
		for(Map.Entry m : lhm.entrySet())
		{
		System.out.println(m.getKey()+">>>"+m.getValue());	
		}
		
		
		
		TreeMap<Integer,String> tm = new TreeMap();
		tm.put(7, "Dhoni");
		tm.put(8, "Jadeja");
		tm.put(3, "Raina");
		System.out.println(tm);
		for(Map.Entry m : tm.entrySet())
		{
		System.out.println(m.getKey()+">>>"+m.getValue());	
		}
		
	}

}
