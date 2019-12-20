package com.example.javadesignmode.watcher;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者--实现类
 * @author fuxiaorong-len
 *
 */
public class Watcher implements Observer {

	public Watcher(Watched watched){
		watched.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Data has been changed to : "+((Watched)o).retrieveData());
	}

}