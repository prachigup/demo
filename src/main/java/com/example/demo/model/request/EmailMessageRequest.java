package com.example.demo.model.request;

public class EmailMessageRequest extends BaseMessageRequest {

	private String messageSubject;

	public EmailMessageRequest() {
		super();
	}

	public EmailMessageRequest(String messageSubject) {
		super();
		this.messageSubject = messageSubject;
	}

	public String getMessageSubject() {
		return messageSubject;
	}

	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	@Override
	public String toString() {
		return "EmailMessageRequest [messageSubject=" + messageSubject + ", messageText=" + messageText + ", from="
				+ from + ", to=" + to + "]";
	}

	
	
}
