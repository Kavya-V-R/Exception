package com.xworkz.Exception.Helmet;
import com.xworkz.Exception.Helmet.Exception.DividedByZero;
public class HelmetTester {
	public static void main(String[] args) {
		System.out.println("Begining of the Programming");
		int a = 10, b = 0, c;
		try {
			if (b == 0) {
				throw new DividedByZero("not able to divide usong zero");
			} else {
				c = a / b;
			}
		} catch (DividedByZero obj) {
			c = 0;
			System.out.println("obj.getStackTrace");
		}
		System.out.println("imp line to be executed" + c);
		System.out.println("end of program");
	}
}
