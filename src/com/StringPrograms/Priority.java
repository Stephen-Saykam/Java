package com.StringPrograms;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		PriorityQueue<Object> p = new PriorityQueue<>();
		p.add("Infosys");
		p.add("Wipro");
		p.add("ADP");
		p.add("Dell");
		p.add("Virtusa");
		p.add("Dell");
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

	}

}
