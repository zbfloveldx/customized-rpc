package com.zbf.server;


import com.zbf.service.HelloRPC;

public class HelloRPCImpl implements HelloRPC {

	@Override
	public String say(String name) {
		return name;
	}
}