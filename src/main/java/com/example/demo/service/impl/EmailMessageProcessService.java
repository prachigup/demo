package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.NotificationPostProcessingException;
import com.example.demo.Exception.NotificationProcessingException;
import com.example.demo.Exception.RequestValidationException;
import com.example.demo.common.IProducer;
import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.EmailMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;
import com.example.demo.service.IAdaptorService;
import com.example.demo.service.IProcessMessageService;
import com.example.demo.service.IValidateService;

@Service("emailMessageProcessService")
public class EmailMessageProcessService implements IProcessMessageService {
	
	@Autowired
	@Qualifier("emailAdaptorService")
	private IAdaptorService<EmailMessageRequest> emailAdaptorService;
	
	@Autowired
	@Qualifier("emailValidateService")
	private IValidateService<EmailMessageRequest> emailValidateService;
	
	@Autowired
	@Qualifier("rabbitMQProducer")
	private IProducer producerService;

	@Override
	public BaseMessageRequest preProcess(NotifyRequest notifyRequest) throws RequestValidationException {
		// TODO Auto-generated method stub
		
		EmailMessageRequest emailMessageRequest = emailAdaptorService.convert(notifyRequest);
		if(!emailValidateService.validateMessage(emailMessageRequest)){
			throw new RequestValidationException("400", "Notification request is invalid");
		}
		
		return emailMessageRequest;
	}

	@Override
	public BaseMessageResponse process(BaseMessageRequest baseMessageRequest) throws NotificationProcessingException {
		// TODO Auto-generated method stub
		BaseMessageResponse baseMessageResponse = producerService.produceMessage(baseMessageRequest);
		return baseMessageResponse;
	}

	@Override
	public NotifyResponse postProcess(BaseMessageResponse baseMessageResponse) throws NotificationPostProcessingException{
		// TODO Auto-generated method stub
		//can do stuff like analytics, logging etc.
		
		NotifyResponse notifyResponse = emailAdaptorService.convert(baseMessageResponse);
		return notifyResponse;
	}

}
