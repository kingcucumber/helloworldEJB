package com.demo.ejb.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.demo.ejb.HelloWorld;
import com.demo.ejb.HelloWorldLocal;
import com.demo.ejb.Other;

@Stateless
@Remote(HelloWorld.class)
public class HelloWorldBean implements HelloWorld,HelloWorldLocal {
	
	//private Other other = new OtherBean();
	@EJB Other other;
	
	public String sayHello(String name) {
//		try {
//			InitialContext ctx = new InitialContext();
//			Other other = (Other) ctx.lookup("OtherBean/local");
//			return name + "say:hello，world！";
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return name + "say:hello!";
	}

}
