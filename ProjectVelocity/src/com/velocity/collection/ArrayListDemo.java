package com.velocity.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Balaji","Rahul","Santosh");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}

	}

}
