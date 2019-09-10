package com.example.demo.service;

import com.example.demo.Exception.NotificationPostProcessingException;
import com.example.demo.Exception.NotificationProcessingException;
import com.example.demo.Exception.RequestValidationException;
import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;

public interface IProcessMessageService {
	
	BaseMessageRequest preProcess(NotifyRequest notifyRequest) throws RequestValidationException ;
	
	BaseMessageResponse process(BaseMessageRequest baseMessageRequest) throws NotificationProcessingException;
	
	NotifyResponse postProcess(BaseMessageResponse baseMessageResponse) throws NotificationPostProcessingException;

}
