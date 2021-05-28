package TestNgNew;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapPractice {

	public static void main(String[] args) {
		TreeMap h = new TreeMap();
		String s = "Hi this is new is old is new";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			int count = 0;
			for (int j = 0; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
					h.put(s1[i], count);
				}
			}
		}
//		System.out.println(h);
		
		
		String key="";
		String value="";
		Set sss= h.entrySet();
		Iterator itr=sss.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();  
//		    System.out.println(entry.getKey()+" "+entry.getValue());
		    String keyy = entry.getValue().toString();
		    		if(keyy.compareTo(value)>0)
		    		{
		    			value=entry.getValue().toString();
		    			key=entry.getKey().toString();
		    		}
		}
		System.out.println(value);
		System.out.println(key);
	}

}
