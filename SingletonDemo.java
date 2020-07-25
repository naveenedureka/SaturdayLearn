package com.main;

import com.singleton.Singleton;

public class SingletonDemo {


	public static void main(String[] args) {
 //Demo d=new Demo();
		Singleton s1=Singleton.createSingletonObject();
		System.out.println(s1.hashCode());
		Singleton s2=Singleton.createSingletonObject();
		System.out.println(s2.hashCode());
		
	}
}
