package com.example.javadesignmode.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@SuppressWarnings("rawtypes")
public class DumpMethods {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		try {
			Class c = Class.forName("java.lang.String");
			Field[] fs = c.getDeclaredFields();
			System.out.println("--------作用域:属性");
			// Modifier ： 用来描述字段的修饰符
			for (Field field : fs) {
				System.out.println(Modifier.toString(field.getModifiers())+" : "+field.getName());
			}
			System.out.println("--------方法");
			Method[] ms = c.getDeclaredMethods();
			for (int i = 0; i < ms.length; i++) {
				System.out.println(ms[i].toString());
			}
			Class c_dump=Class.forName("com.common.DumpUser");
			System.out.println("----------------我是分割线-------实例检测------"+c_dump.getName());
			boolean b_01=c_dump.isInstance(new Integer(32));
			System.out.println("isInstance new Integer : "+b_01);
			boolean b_02=c_dump.isInstance(new DumpUser());
			System.out.println("isInstance new Date : "+b_02);
			System.out.println("----------------我是分割线-------找出类的方法------");
			Method[] methods=c_dump.getDeclaredMethods();
			for(Method method:methods){
				// 方法名称
				System.out.println("method name is : "+method.getName());
				// 所属的类（包括包名）
				System.out.println("method declar class is :"+method.getDeclaringClass());
				// 方法参数类型
				Class[] params = method.getParameterTypes();
				for(int i=0;i<params.length;i++){
					System.out.println("method param ("+i+") : "+params[i]);
				}
				// 方法的异常
				Class[] exceptions=method.getExceptionTypes();
				for(int j=0;j<exceptions.length;j++){
					System.out.println("method exception ("+j+") : "+exceptions[j]);
				}
				// 方法返回类型
				System.out.println("method return type is :"+method.getReturnType());
				System.out.println("---------------");
			}
			System.out.println("----------------我是分割线-------找出类的构造器信息------");
			Constructor[] constructors=c_dump.getDeclaredConstructors();
			for(Constructor constructor:constructors){
				// 构造器名称
				System.out.println("Constructor name is :"+constructor.getName());
				// 所属的类（包括包名）
				System.out.println("Constructor declar class is : "+constructor.getDeclaringClass());
				// 构造器参数类型
				Class[] params=constructor.getParameterTypes();
				for(int i=0;i<params.length;i++){
					System.out.println("Constructor param ("+i+") : "+params[i]);
				}
				// 构造器异常信息
				Class[] exceptions=constructor.getExceptionTypes();
				for(int j=0;j<exceptions.length;j++){
					System.out.println("Constructor exception ("+j+") : "+exceptions[j]);
				}
				System.out.println("---------------");
			}
			System.out.println("----------------我是分割线-------根据方法的名称来执行方法------");
			// 参数类型
			Class[] parameterTypes=new Class[3];
			parameterTypes[0]=Integer.TYPE;
			parameterTypes[1]=Integer.TYPE;
			parameterTypes[2]=Integer.TYPE;
			Method method=c_dump.getMethod("add", parameterTypes);
			// 参数值
			Object[] values=new Object[3];
			values[0]=new Integer(33);
			values[1]=new Integer(44);
			values[2]=new Integer(55);
			// 调用方法并返回结果
			Object object = method.invoke(new DumpUser(), values);
			Integer objectInteger=(Integer)object;
			System.out.println(objectInteger.intValue());
			System.out.println("----------------我是分割线-------创建新的对象并赋值------");
			// 参数类型
			Class[] c_parameterTypes=new Class[4];
			c_parameterTypes[0]=String.class;
			c_parameterTypes[1]=String.class;
			c_parameterTypes[2]=String.class;
			c_parameterTypes[3]=String.class;
			Constructor c_new_object=c_dump.getConstructor(c_parameterTypes);
			// 参数值
			Object[] c_values=new Object[4];
			c_values[0]=new String("11");
			c_values[1]=new String("22");
			c_values[2]=new String("33");
			c_values[3]=new String("44");
			Object _new=c_new_object.newInstance(c_values);
			DumpUser dumpUser=(DumpUser)_new;
			dumpUser.print();
			System.out.println("----------------我是分割线-------改变字段(域)的值（字段不能用private修饰）------");
			Field c_field=c_dump.getField("id");
			c_field.set(dumpUser, "55");
			dumpUser.print();
			System.out.println("----------------我是分割线-------使用数组------");
			Class cls_array = Class.forName("java.lang.String");
			Object obj_array = Array.newInstance(cls_array, 5);// 创建长度为5的数组
			Array.set(obj_array, 4, "This is fifth value test.");// 为第四个位置的元素赋值
			String val_array_4 = (String)Array.get(obj_array, 4);// 获取数组第四个位置元素的值，没有赋值的元素，获取的值为null
			System.out.println(val_array_4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
