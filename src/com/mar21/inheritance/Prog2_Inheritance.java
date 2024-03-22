package com.mar21.inheritance;
/*
 * @author Harshitha.D
 * creates an instances of Manger and Engineer to calculate the bonus 
 */
public class Prog2_Inheritance {
	public static void main(String[] args) {
		Manager m = new Manager("murali", 12378);
		System.out.println(m.calculateBonus());
		Engineer e = new Engineer("hash", 7381f);
		System.out.println(e.calculateBonus());
	}
}
