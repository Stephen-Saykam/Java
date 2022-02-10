package com.StringPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("Maths");
		s.add("Science");
		Iterator<String> i = s.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		ArrayList<Float> f = new ArrayList<>();
		f.add(68.67f);
		f.add(72.66f);
		ListIterator<Float> j = f.listIterator();
		while(j.hasNext()==true)
		{
			System.out.println(j.next());
		}
		while(j.hasPrevious()==true)
		{
			System.out.println(j.previous());
		}
		
		ArrayList<Object> o = new ArrayList<>();
		o.add("Uncle");
		o.add("Aunty");
		o.add(32);
		for(int k=0; k<o.size(); k++)
		{
			System.out.println(o.get(k));
		}
		

	}

}
