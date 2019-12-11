package com.example.javadesignmode.custom;
/**
 * 抽象主题--接口
 * @author fuxiaorong-len
 *
 */
public interface Subject {

	/**
	 * 增加一个观察者对象
	 * @param observer
	 */
	public void attach(Observer observer);
	/**
	 * 删除一个观察者对象
	 * @param observer
	 */
	public void detach(Observer observer);
	/**
	 * 通知各个观察者刷新自己
	 */
	public void notifyObservers();
}
