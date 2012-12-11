package com.demo.app;

import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InitialContext ctx = new InitialContext();
			
			QueueConnectionFactory factory = (QueueConnectionFactory) ctx
					.lookup("QueueConnectionFacotry");

			QueueConnection conn = factory.createQueueConnection();
			
			QueueSession session  = conn.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			
			Destination destination = (Destination) ctx.lookup("queue/itcastQueue");
			
			MessageProducer producer = session.createProducer(destination);
			
			producer.send(session.createTextMessage("hello,world"));
			session.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
