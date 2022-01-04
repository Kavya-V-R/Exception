package com.xworkz.Exception;

public class EventHandler {
	public EventHandler() {
		System.out.println("Event handler's object");
	}

	public void createEvent(boolean status) throws Throwable {
		if (status) {
			Throwable throwable = new Throwable();
			throw throwable;
		} else

		{
			System.out.println("event not been created");
		}
	}

	public void frame1() throws Throwable {
		System.out.println("inside frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("inside frame2");
		this.frame3();
	}

	public void frame3() throws Throwable {
		System.out.println("inside frame2");
		this.frame4();
	}

	public void frame4() throws Throwable {
		System.out.println("inside frame2");
		this.createEvent(true);
	}
}