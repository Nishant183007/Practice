package TestNgNew;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice2 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(1, "Nishant");
		h.put(2, "Dhoni");
Set s= h.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry entry=(Map.Entry)itr.next();  
    System.out.println(entry.getKey()+" "+entry.getValue());  
}
		
		
		
	}

}
