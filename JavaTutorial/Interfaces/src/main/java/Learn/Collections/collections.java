package Learn.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class collections {
	
	ArrayList<Double> al = null ;
	LinkedList<Double> ll = null;
	HashSet<Double> hs = null;
	TreeSet<Double> ts = null;
	
	
	public void ArrayListTest() {
		long startTime = System.currentTimeMillis();
		al = new ArrayList<Double>();
		al.add(2.0);al.add(3.0);al.add(4.0);al.add(6.0);al.add(1.0);al.add(5.0);al.add(8.0);al.add(7.0);
		ListIterator<Double> iter = al.listIterator();
		while(iter.hasNext()) {
			Double element = iter.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Time to parse ArrayList "+ (System.currentTimeMillis()-startTime+" unit"));
		for(Double element: al) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public void LinkedListTest() {
		long startTime = System.currentTimeMillis();
		ll = new LinkedList<Double>();
		ll.add(2.0);ll.add(3.0);ll.add(4.0);ll.add(6.0);ll.add(1.0);ll.add(5.0);ll.add(8.0);ll.add(7.0);
		ListIterator<Double> iter = ll.listIterator();
		while(iter.hasNext()) {
			Double element = iter.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Time to parse LinkedList "+ (System.currentTimeMillis()-startTime+" unit"));
		for(Double element: ll) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public void HashSetTest() {
		long startTime = System.currentTimeMillis();
		hs = new HashSet<Double>();
		hs.add(2.0);hs.add(3.0);hs.add(4.0);hs.add(6.0);hs.add(1.0);hs.add(5.0);hs.add(8.0);hs.add(7.0);
		Iterator<Double> iter = hs.iterator();
		while(iter.hasNext()) {
			Double element = iter.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Time to parse HashSet "+ (System.currentTimeMillis()-startTime+" unit"));
		for(Double element: hs) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public void TreeSetTest() {
		long startTime = System.currentTimeMillis();
		ts = new TreeSet<Double>();
		ts.add(2.0);ts.add(3.0);ts.add(4.0);ts.add(6.0);ts.add(1.0);ts.add(5.0);ts.add(8.0);ts.add(7.0);
		Iterator<Double> iter = ts.iterator();
		while(iter.hasNext()) {
			Double element = iter.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Time to parse HashSet "+ (System.currentTimeMillis()-startTime+" unit"));
		for(Double element: ts) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
