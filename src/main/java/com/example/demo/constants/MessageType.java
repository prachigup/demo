package com.example.demo.constants;

public enum MessageType {
	
	EMAIL("email", "EMAIL_QUEUE"), SLACK("slack", "SLACK_QUEUE");
	
	private String messageType;
	private String queueRoutingKey;
	
	private MessageType(String type, String routingKey){
		this.messageType = type;
		this.queueRoutingKey = routingKey;
	}

}
