package com.xworkz.Exception;

public class Registration {
	private int age;

	public Registration() {
		System.out.println("inside the registration");
	}

	public void setAge(int age) throws Throwable {
		if (age > 100) {
			Throwable throwable = new Throwable("please enter valid age");
			throw throwable;
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}
}
