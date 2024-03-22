package com.mar21.pojo.model;
/*
 * @author Harshitha.D
 * HashSet and store the unique POJO in the application
 */
import java.util.HashSet;

public class Pojo {
	public static void main(String[] args) {
		HashSet<Shape> hs=new HashSet<Shape>();
		hs.add(new Shape("square",4));
		hs.add(new Shape("circle",0));
		hs.add(new Shape("rectangle",4));
		hs.add(new Shape("square",4));
		System.out.println(hs);
	}
}
