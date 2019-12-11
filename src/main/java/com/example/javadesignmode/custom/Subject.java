package com.example.javadesignmode.custom;
/**
 * ��������--�ӿ�
 * @author fuxiaorong-len
 *
 */
public interface Subject {

	/**
	 * ����һ���۲��߶���
	 * @param observer
	 */
	public void attach(Observer observer);
	/**
	 * ɾ��һ���۲��߶���
	 * @param observer
	 */
	public void detach(Observer observer);
	/**
	 * ֪ͨ�����۲���ˢ���Լ�
	 */
	public void notifyObservers();
}
