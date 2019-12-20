package com.example.javadesignmode.watcher;

import java.util.Observer;

/**
 * 观察者模式-测试类
 * @author fuxiaorong-len
 *
 */
public class Tester {

	static private Watched watched;
	static private Observer watcher;
	public static void main(String[] args) {
		watched = new Watched();
		watcher = new Watcher(watched);
		watched.changeData("In C , we create bugs.");
		watched.changeData("In Java , we inherit bugs.");
		watched.changeData("In Java , we inherit bugs.");
		watched.changeData("In Visual Basic , we visualize bugs.");
	}

}
