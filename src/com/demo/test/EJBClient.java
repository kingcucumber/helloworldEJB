package com.demo.test;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.demo.ejb.HelloWorld;

public class EJBClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Properties props = new Properties();
//		props.setProperty("java.naming.factory.initial",
//				"org.jnp.interfaces.NamingContextFactory");
//		props.setProperty("java.naming.provider.url", "localhost:1099");
		try {
			InitialContext ctx = new InitialContext();
			HelloWorld helloworld = (HelloWorld) ctx
					.lookup("HelloWorldBean/remote");
			System.out.println(helloworld.sayHello("wow"));

		} catch (NamingException e) {
			System.out.println(e.getMessage());
		}
	}

}
