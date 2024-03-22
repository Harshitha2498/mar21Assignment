package com.mar21.customMap.models;

/*
 * @author Harshitha.D
 * create a custom class with setters and getters
 */
public class Custom {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Custom(Integer key, String value) {
		this.id = key;
		this.name = value;
	}

	// Override the toString() to return the id and name
	@Override
	public String toString() {
		return "id = " + this.id + ", value = " + this.name;
	}

}