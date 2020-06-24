package com.redfern.cat_project;

public class Cat {
	
	private String name;
private String gender;
private int age;
private boolean isaMouser= true;



	public Cat(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		
	}
	public boolean isaMouser() {
		return isaMouser;
	}
	

	public String getname() {
		
		return this.name;
	}

	public Object getGender() {
		// TODO Auto-generated method stub
		return this.gender;
	}

	public Object getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

}
