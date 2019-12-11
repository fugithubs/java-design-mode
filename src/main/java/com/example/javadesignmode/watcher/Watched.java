package com.example.javadesignmode.watcher;

import java.util.Observable;

/**
 * 具体主题角色
 * @author fuxiaorong-len
 *
 */
public class Watched extends Observable {

	private String data="";

	public String retrieveData(){
		return this.data;
	}

	public void changeData(String data){
		if(!this.data.equals(data)){
			this.data = data;
			setChanged();
		}
		notifyObservers();// 更新所有的观察者
	}
}
