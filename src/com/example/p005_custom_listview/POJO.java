package com.example.p005_custom_listview;

public class POJO {
	
	private String name;
	private String phone;
	private String email;
	
	public  POJO(String name, String phone, String email){
		
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		
	};
	
	public String getName(){return this.name;}
	public String getEmail(){return this.email;}
	public String getPhone(){return this.phone;}
	
	

}
