package net.bill99.action;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
	

	@Autowired
	private Car car;
	@Autowired
	private Office office;
	
	public void info() {
		System.out.println("Boss {car=" +"["+ car.getBrand()+","+car.getPrice() +"]"+ ", office=" + office.getOfficeNo() + "}");
		
	}
	
	

}
