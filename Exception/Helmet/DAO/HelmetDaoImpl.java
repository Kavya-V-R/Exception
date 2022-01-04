package com.xworkz.Exception.Helmet.DAO;

import com.xworkz.Exception.Helmet.DTO.HelmetDto;

public class HelmetDaoImpl implements HelmetDao {
HelmetDto helmets[]=new HelmetDto[10];
static int index=0;
public HelmetDaoImpl() {
System.out.println("inside the helmet dao Impl");
}
public void save(HelmetDto dto) {
	System.out.println("inside the save method");
	helmets[index]=dto;
}
public void  display() {
	System.out.println("displaying helmets");
	for(int i=0;i<index;i++) {
		System.out.println(helmets[i].getBrand());
		System.out.println(helmets[i].getColour());
		System.out.println(helmets[i].getPrice());
	}
}
}
