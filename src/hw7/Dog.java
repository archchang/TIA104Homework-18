package hw7;

import java.io.Serializable;

public class Dog implements Animal, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
