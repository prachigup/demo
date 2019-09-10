package com.example.demo.Exception;

public class NotificationProcessingException extends BaseException {

	public NotificationProcessingException() {
		super();
	}

	public NotificationProcessingException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
