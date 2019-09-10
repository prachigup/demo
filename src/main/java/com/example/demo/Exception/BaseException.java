package com.example.demo.Exception;

public class BaseException extends Exception{

	String errorCode;
	String errorMessage;

	public BaseException(){
		super();
	}
	
	public BaseException(String errorCode, String errorMessage){
		super(errorMessage);
	}
}
