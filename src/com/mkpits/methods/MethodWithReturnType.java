package com.mkpits.methods;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// Methods with return type - 
		// we can call non static variable - by objectReference
		
		MethodWithReturnType mrt = new MethodWithReturnType();
		//String fName = mrt.getFirstName();
		//System.out.println(fName);
		System.out.println(mrt.getFirstName());
		System.out.println(mrt.getLastName());
		System.out.println(mrt.getEmailAdd());
		System.out.println(mrt.getMobile());
		System.out.println(mrt.getGender());
		System.out.println(mrt.getPassword());
		System.out.println("Calling all methods by getAllData() : ");
		mrt.getAllData();
	}
	public String getFirstName() {
		String firstName = "Karan";
		return firstName;
	}
	public String getLastName() {
		String lastName = "Mohod";
		return lastName;
	}
	public String getEmailAdd() {
		String emailAdd = "karanmohod19@gmail.com";
		return emailAdd;
	}
	public long getMobile() {
		long mobileNo = 9545590729l;
        return mobileNo;
		}
	public String getGender() {
		String gender = "Male";
        return gender;
		}
	public String getPassword() {
		String password = "Karan@159";
		return password;
	}
	public void getAllData() {
		System.out.println(getFirstName());
		System.out.println(getLastName());
		System.out.println(getEmailAdd());
		System.out.println(getMobile());
		System.out.println(getGender());
		System.out.println(getPassword());
	}

}
