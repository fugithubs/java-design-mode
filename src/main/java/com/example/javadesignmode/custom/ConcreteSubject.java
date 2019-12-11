package com.example.javadesignmode.custom;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ��������--ʵ����
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
	 * ����һ���۲��߶���
	 */
	@Override
	public void attach(Observer observer) {
		observersVector.addElement(observer);
	}
	/**
	 * ɾ��һ���۲��߶���
	 */
	@Override
	public void detach(Observer observer) {
		observersVector.removeElement(observer);
	}
	/**
	 * ֪ͨ�����۲���ˢ���Լ�
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
