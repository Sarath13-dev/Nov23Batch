package org.emp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class Employee {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		
		ListIterator<Integer> listIterator = li.listIterator();
		
		while(listIterator.hasNext() ) {
			System.out.println(listIterator.next());
			System.out.println(listIterator.nextIndex());
		}
		System.out.println("===============================");
		while(listIterator.hasPrevious() ) {
			System.out.println(listIterator.previous());
			System.out.println(listIterator.previousIndex());
			listIterator.remove();
		}
		
		System.out.println(li);
		
		li.add(1000);
		
		li.set(0, 2000);
		System.out.println(li);
		System.out.println("QA Work");
		System.out.println("Work done by Ram");
	}
	
	
	
	
}
