package com.example.demo.model.response;

import java.io.Serializable;

public class NotifyResponse implements Serializable{
	
	String resultMessage;
	String resultStatus;
	String resultCode;
	
	public NotifyResponse() {
		super();
	}

	public NotifyResponse(String resultMessage, String resultStatus, String resultCode) {
		super();
		this.resultMessage = resultMessage;
		this.resultStatus = resultStatus;
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	@Override
	public String toString() {
		return "NotifyResponse [resultMessage=" + resultMessage + ", resultStatus=" + resultStatus + ", resultCode="
				+ resultCode + "]";
	}
	
	

}
