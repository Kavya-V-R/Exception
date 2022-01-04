package com.xworkz.Exception;

public class RegistrationTester {
public static void main(String[] args) throws  Throwable{
	Registration registration = new Registration();
	registration.setAge(24);
	System.out.println("after calli set method");
	System.out.println("Age is "+registration.getAge());
}
}
