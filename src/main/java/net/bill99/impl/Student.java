package net.bill99.impl;

import net.bill99.server.Persion;

public class Student implements Persion {
	
	private String name;
	private int age;
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Ñ§ÉúÑ§Ï°");
	}
	
	public void info(){
		System.out.println("name:"+name+"  age:"+age);
	}
	

}
