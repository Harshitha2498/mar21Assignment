package com.mar21.inheritance;
import com.mar21.inheritance.models.Employee;
/*
 * @author Harshitha.D
 * Engineer class extends Employee class
 */
public class Engineer extends Employee {
	//Engineer constructor having name and salary parameters
	public Engineer(String name, float salary) {
		setName(name);
		setSalary(salary);
	}
	//Override the calculateBonus() method
	@Override
	public float calculateBonus() {
		return (float) (getSalary() * 0.05);
	}
}
