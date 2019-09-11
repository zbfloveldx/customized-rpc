package com.zbf;


import com.zbf.provider.RPCServer;

public class RpcApplitation {
	 public static void main(String[] args) throws Exception {
	        new RPCServer(9999).start();
	    }
}
