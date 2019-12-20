package com.example.javadesignmode.custom;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 具体主题--实现类
 * @author fuxiaorong-len
 *
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class ConcreteSubject implements Subject {

	private Vector observersVector = new Vector();
	
	public Vector getObserversVector() {
		return observersVector;
	}
	public void setObserversVector(Vector observersVector) {
		this.observersVector = observersVector;
	}
	/**
	 * 增加一个观察者对象
	 */
	@Override
	public void attach(Observer observer) {
		observersVector.addElement(observer);
	}
	/**
	 * 删除一个观察者对象
	 */
	@Override
	public void detach(Observer observer) {
		observersVector.removeElement(observer);
	}
	/**
	 * 通知各个观察者刷新自己
	 */
	@Override
	public void notifyObservers() {
		Enumeration enumeration = this.observers();
		while(enumeration.hasMoreElements()){
			((Observer)enumeration.nextElement()).update();
		}
	}
	
	public Enumeration observers(){
		return ((Vector)observersVector.clone()).elements();
	}

}
