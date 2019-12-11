package com.example.javadesignmode.prototype;

public abstract class AbstractProtoType implements Cloneable {

	String name;
	String idcard;
	
	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Object clone(){
		Object object=null;
		try{
			object=super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return object;
	}
}
