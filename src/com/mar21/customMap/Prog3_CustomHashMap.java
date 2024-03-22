package com.mar21.customMap;

/*
 * @author Harshitha.D
 * main method 
 */
public class Prog3_CustomHashMap {
	public static void main(String[] args) {
		CustomMap<Integer, String> customMap = new CustomMap<Integer, String>();
		customMap.put(1, "harshi");
		customMap.put(2, "varma");
		customMap.put(1, "varma2");
		customMap.put(3, "ayyan");
		customMap.put(null, "ani");
		customMap.put(null, "hash");
		System.out.println("map values: " + customMap);
		customMap.printList();
		System.out.println("get the value of 1: " + customMap.get(1));
		System.out.println("get the value of 3: " + customMap.get(3));

	}

}
