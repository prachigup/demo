package com.example.demo.model.request;

import java.io.Serializable;

public class NotifyRequest implements Serializable {
	
	private static final long serialVersionUID = 811282599017369482L;
	
	String messagetext;
	String messageSubject;
	String from;
	String to;
	String messageType;
	
	public NotifyRequest(){}
	
	public NotifyRequest(String messagetext, String messageSubject, String from, String to, String messageType) {
		super();
		this.messagetext = messagetext;
		this.messageSubject = messageSubject;
		this.from = from;
		this.to = to;
		this.messageType = messageType;
	}

	public String getMessagetext() {
		return messagetext;
	}

	public void setMessagetext(String messagetext) {
		this.messagetext = messagetext;
	}

	public String getMessageSubject() {
		return messageSubject;
	}

	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
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

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	@Override
	public String toString() {
		return "NotifyRequest [messagetext=" + messagetext + ", messageSubject=" + messageSubject + ", from=" + from
				+ ", to=" + to + ", messageType=" + messageType + "]";
	}
	
	

}
