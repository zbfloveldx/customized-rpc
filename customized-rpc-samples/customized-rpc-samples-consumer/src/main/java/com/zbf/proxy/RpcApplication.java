package com.zbf.proxy;


import com.zbf.invoker.NettyRPCProxy;
import com.zbf.service.HelloRPC;

public class RpcApplication {
	public static void main(String[] args) {
		HelloRPC helloRPC = (HelloRPC) NettyRPCProxy.create(HelloRPC.class);
		System.out.println(helloRPC.say("RPC"));
	}
}