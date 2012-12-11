package com.demo.ejb.message;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "topic/itcastTopic") })
public class ReceiveOtherBean implements MessageListener {

	@Override
	public void onMessage(Message message) {
		TextMessage msg = (TextMessage) message;
		System.out.println(msg.getText());

	}

}
