package com.example.demo.Exception;

public class RequestValidationException extends BaseException{

	public RequestValidationException() {
		super();
	}

	public RequestValidationException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
