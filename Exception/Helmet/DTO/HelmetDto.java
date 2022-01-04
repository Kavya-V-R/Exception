package com.xworkz.Exception.Helmet.DTO;

public class HelmetDto {
	private String brand;
	private String colour;
	private int price;
	private char size;
	private double weight;

	public HelmetDto(String brand, String colour, int price, char size, double weight) {
		System.out.println("inside helmet class");
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
	this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Helmet [brand="+brand+",price="+price+",colour="+colour+",size="+size+",weight="+weight+",]";
	}

}
