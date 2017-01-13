package com.truck_app;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.*;

public class EndPoint {

	protected Channel mChannel;
	protected  Connection mConnection;
	protected String mEndPointName;
	
	protected String mExchange;
	
	public EndPoint(String name, String exchangeName) throws IOException, TimeoutException {
		mEndPointName = name;

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        mConnection = factory.newConnection();
        
        mChannel = mConnection.createChannel();
        if(null != exchangeName && !exchangeName.equals("")) {
        	mExchange = exchangeName;
        	mChannel.exchangeDeclare(mExchange, "fanout");
        } else {
        	mExchange = "";
        }
        mChannel.queueDeclare(mEndPointName, true, false, false, null);
	}
	
	public void close() throws IOException, TimeoutException {
		mChannel.close();
		mConnection.close();
	}
}
