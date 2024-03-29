package com.zbf.invoker;

import io.netty.channel.*;

//客户端业务处理类
public class ResultHandler extends ChannelInboundHandlerAdapter {

	private Object response;

	public Object getResponse() {
		return response;
	}

	@Override // 读取服务器端返回的数据(远程调用的结果)
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		response = msg;
		ctx.close();
	}
}
