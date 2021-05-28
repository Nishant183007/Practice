package TestNgNew;

import java.util.*;

public class JavaCollections {

	public static void main(String[] args) {

		/*
		 * List,Set,queue List- ArrayList,LinkedList,Vector,Stack ----Insertion order is
		 * preserved,allows duplicates, multiple null values Set -
		 * HashSet,LinkedHashSet, TreeSet ----Insertion order is not preserved, allows
		 * duplicates, only one null value Queue - PriorityQueue(),DeQueue() ---
		 * Insertion order is not preserved
		 * 
		 * 
		 * ArrayList v/s LinkedList ---Array list normal List , Linked list doubly
		 * linked list HashSet- Insertion order is not preserved Linked HashSet-
		 * Insertion order is preserved TreeSet- Follows sorting in ascending order
		 * 
		 * 
		 * 
		 * 
		 */
		JavaCollections jc = new JavaCollections();
		jc.arrayList();
		jc.linkedList();
		jc.queuePractice();
		jc.vectorPractice();
		jc.stackPractice();
		jc.hashSet();
		jc.linkedHashSet();
		jc.treeSet();
	}

	public void arrayList() {
		ArrayList al = new ArrayList();
		al.add("Naidana");
		al.add("Nishant");
		al.add("is");
		al.add("fan");
		al.add("of");
		al.add("Mahendra");
		al.add("Singh");
		al.add("Dhoni");
		System.out.println(al);
	}

	public void linkedList() {
		LinkedList ll = new LinkedList();
		ll.add("Naidana");
		ll.add("Nishant");
		ll.add("is");
		ll.add("fan");
		ll.add("of");
		ll.add("Mahendra");
		ll.add("Singh");
		ll.add("Dhoni");
		System.out.println(ll);
	}

	public void vectorPractice() {
		Vector v = new Vector();
		v.add("Naidana");
		v.add("Nishant");
		v.add("is");
		v.add("fan");
		v.add("of");
		v.add("Mahendra");
		v.add("Singh");
		v.add("Dhoni");
		System.out.println(v);
	}

	public void stackPractice() {
		Stack v = new Stack();
		v.add("Naidana");
		v.add("Nishant");
		v.add("is");
		v.add("fan");
		v.add("of");
		v.add("Mahendra");
		v.add("Singh");
		v.add("Dhoni");
		System.out.println(v);
	}

	public void hashSet() {
		HashSet hs = new HashSet();
		hs.add("Naidana");
		hs.add("Nishant");
		hs.add("is");
		hs.add("fan");
		hs.add("of");
		hs.add("Mahendra");
		hs.add("Singh");
		hs.add("Dhoni");
		System.out.println(hs);
	}

	public void linkedHashSet() {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Naidana");
		lhs.add("Nishant");
		lhs.add("is");
		lhs.add("fan");
		lhs.add("of");
		lhs.add("Mahendra");
		lhs.add("Singh");
		lhs.add("Dhoni");
		System.out.println(lhs);
	}

	public void treeSet() {
		TreeSet<String> ts = new TreeSet();
		ts.add("Naidana");
		ts.add("Nishant");
		ts.add("Mahendra");
		ts.add("Singh");
		ts.add("Dhoni");
		System.out.println(ts);
	}

	public void queuePractice() {
		Queue qp = new PriorityQueue();
		qp.add("Naidana");
		qp.add("Nishant");
		qp.add("is");
		qp.add("fan");
		qp.add("of");
		qp.add("Mahendra");
		qp.add("Singh");
		qp.add("Dhoni");
		System.out.println(qp);
	}

}
