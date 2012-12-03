package com.demo.ejb.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.demo.ejb.HelloWorld;

@Stateless
@Remote(HelloWorld.class)
public class HelloWorldBean implements HelloWorld {
	
	public String sayHello(String name) {
		return name + "say:hello，world！";
	}

}
