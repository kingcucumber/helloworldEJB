package com.demo.app;

import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;

import javax.naming.InitialContext;

public class TopicSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InitialContext ctx = new InitialContext();

			TopicConnectionFactory factory = (TopicConnectionFactory) ctx
					.lookup("topicConnectionFacotry");

			TopicConnection conn = factory.createTopicConnection();

			TopicSession session = conn.createTopicSession(false,
					TopicSession.AUTO_ACKNOWLEDGE);

			Destination destination = (Destination) ctx
					.lookup("topic/itcasttopic");

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
