package com.xworkz.Exception.Helmet.Service;

import com.xworkz.Exception.Helmet.DTO.HelmetDto;
import com.xworkz.Exception.Helmet.Exception.InvalidBrand;
import com.xworkz.Exception.Helmet.Exception.InvalidPrice;

public class HelmetServiceImpl implements HelmetService {
	boolean status = true;

	public HelmetServiceImpl() {
		System.out.println("inside the helmet service class");
	}

public void validateSave(HelmetDto dto) throws InvalidBrand{
	if(dto.getBrand()==null || dto.getBrand().length()<2){
		InvalidBrand invalidBrand = new InvalidBrand("invalid brand");
		throw invalidBrand;
	}
	if(dto.getPrice()==0) {
		InvalidPrice invalidPrice = new InvalidPrice("invalid price");
		throw invalidPrice;
	}
}
}
