package com.example.demo.model.request;

import java.io.Serializable;

public abstract class BaseMessageRequest implements Serializable{
	
	private static final long serialVersionUID = -266486124088102741L;
	
	String messageText;
	String from;
	String to;
	
	public BaseMessageRequest() {
		super();
	}
	
	public BaseMessageRequest(String messageText, String from, String to) {
		super();
		this.messageText = messageText;
		this.from = from;
		this.to = to;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "BaseMessageRequest [messageText=" + messageText + ", from=" + from + ", to=" + to + "]";
	}

	
}
