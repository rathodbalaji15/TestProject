package com.velocity.collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(14);
		for (Integer i : set) {
			System.out.println(i);
			
		}
	}

}
