package com.demo.ejb.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.demo.ejb.Other;

@Stateless
@Local(Other.class)
public class OtherBean implements Other {

	@Override
	public String sayMe() {
		// TODO Auto-generated method stub
		return "Other";
	}

}
