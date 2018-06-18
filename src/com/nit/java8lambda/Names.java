package com.nit.java8lambda;

public class Names {
	public String lastname;
	public String firstname;
	public int age;
	

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Names(String f, String l, int a) {
		firstname=f;
		lastname=l;
		age=a;
	}

	public String toString() {
		return lastname+", "+firstname;
	}
}
