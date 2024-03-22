package com.mar21.pojo;
/*
 * @author Harshitha.D
 * setters and getters
 */
import java.util.Objects;

public class Shape {
	private String type;
	private int sides;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	//Override the equals() to check is there any duplicates are not
	@Override
	public boolean equals(Object o) {
		Shape s=(Shape) o;
		return sides==s.sides && type.equals(s.type);	
	}
	//Override the hashCode to generate the custom hashCode
	@Override
	public int hashCode() {
		return Objects.hash(type,sides);
	}
	public Shape(String type,int sides){
		super();
		this.type=type;
		this.sides=sides;	
	}
	//prints the type and sides
	public String toString() {
		return "type : "+type+"  Sides : "+sides;
		
	}
}
