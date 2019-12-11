package com.example.javadesignmode.reflection;

import java.io.FileNotFoundException;

public class DumpUser {

	public String id;
	public String name;
	public String card;
	public String address;

	public DumpUser() {
		
	}
	
	public DumpUser(String name,String card,String address) throws NullPointerException {
		this.name=name;
		this.card=card;
		this.address=address;
	}
	
	public DumpUser(String id,String name,String card,String address) throws FileNotFoundException {
		this.id=id;
		this.name=name;
		this.card=card;
		this.address=address;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardInfo() {

		return "1111" + this.getCard() + "222222";
	}

	public String getUserById(String id) throws Exception {

		return id;
	}
	
	public int add(int a,int b,int c){
		return a+b+c;
	}
	
	public void print(){
		System.out.println("dumpUser address : "+this.getAddress());
		System.out.println("dumpUser card : "+this.getCard());
		System.out.println("dumpUser id : "+this.getId());
		System.out.println("dumpUser name : "+this.getName());
	}
}
