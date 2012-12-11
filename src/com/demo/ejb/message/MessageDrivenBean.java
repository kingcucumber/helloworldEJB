package com.demo.ejb.message;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig =
{
		@ActivationConfigProperty(propertyName = "destinationType", 
				propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", 
				propertyValue = "queue/itcastQueue") 
})
public class MessageDrivenBean implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// tell the address and port
		TextMessage msg = (TextMessage) message;
		System.out.println(msg.getText());
	}

}
