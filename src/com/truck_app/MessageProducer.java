package com.truck_app;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MessageProducer extends EndPoint {

	public MessageProducer(String name, String exchangeName) throws IOException, TimeoutException {
		super(name, exchangeName);
		
	}

	public void sendMessage(String message) throws IOException {
		mChannel.basicPublish(mExchange, mEndPointName, null, message.getBytes());
	}
	
}
