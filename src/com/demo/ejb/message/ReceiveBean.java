package com.demo.ejb.message;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType",
				propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "destination",
				propertyValue = "topic/itcastTopic") })
public class ReceiveBean implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub

	}

}
