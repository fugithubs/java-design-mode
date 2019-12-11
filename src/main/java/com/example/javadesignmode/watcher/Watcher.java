package com.example.javadesignmode.watcher;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���--ʵ����
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