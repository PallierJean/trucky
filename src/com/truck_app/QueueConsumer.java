package com.truck_app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.apache.commons.lang.SerializationUtils;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.ShutdownSignalException;

public class QueueConsumer extends EndPoint implements Runnable, Consumer {

	
	public QueueConsumer(String name, String exchangeName) throws IOException, TimeoutException {
		super(name, exchangeName);
		if(!mExchange.equals(""))
		    mChannel.queueBind(mEndPointName, mExchange, "");
	}
	
	public void run() {
		try {
			mChannel.basicConsume(mEndPointName, true, this);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	/* Le consumer est enregistré */
	@Override
	public void handleConsumeOk(String consumerTag) {
		System.out.println("Consumer "+consumerTag +" enregistré.");
		
	}

	/* Un nouveau message est disponible */
	@Override
	public void handleDelivery(String consumerTag, Envelope env, BasicProperties props, byte[] body) throws IOException {
		Map map = (HashMap)SerializationUtils.deserialize(body);
	    System.out.println("Message Number "+ map.get("message number") + " received.");
	}

	public void handleCancel(String arg0) throws IOException {}
	public void handleCancelOk(String consumerTag) {}
	public void handleRecoverOk(String arg0) {}
	public void handleShutdownSignal(String arg0, ShutdownSignalException arg1) {}
}
