package com.StringPrograms;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkListProgram {

	public static void main(String[] args) {
		LinkedList<Object> p = new LinkedList<>();
		p.add("Infosys");
		p.add("Wipro");
		p.add("ADP");
		p.add("Dell");
		p.add("Virtusa");
		p.add("Dell");
		p.add(null);
		p.add(1256);
		/*
		System.out.println(p.peek());
		System.out.println(p.contains("ADP"));
		System.out.println(p.poll());
		System.out.println(p.contains("ADP"));
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.size());
		System.out.println(p.poll());
		System.out.println(p.poll());
		*/
		System.out.println(p);

	}

}
