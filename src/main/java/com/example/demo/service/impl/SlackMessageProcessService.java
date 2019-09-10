package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.NotificationPostProcessingException;
import com.example.demo.Exception.NotificationProcessingException;
import com.example.demo.Exception.RequestValidationException;
import com.example.demo.common.IProducer;
import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.request.SlackMessageRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;
import com.example.demo.service.IAdaptorService;
import com.example.demo.service.IProcessMessageService;
import com.example.demo.service.IValidateService;

@Service("slackMessageProcessService")
public class SlackMessageProcessService implements IProcessMessageService {

	@Autowired
	@Qualifier("slackAdaptorService")
	private IAdaptorService<SlackMessageRequest> slackAdaptorService;
	
	@Autowired
	@Qualifier("slackValidateService")
	private IValidateService<SlackMessageRequest> slackValidateService;
	
	@Autowired
	@Qualifier("rabbitMQProducer")
	private IProducer producerService;
	
	
	@Override
	public BaseMessageRequest preProcess(NotifyRequest notifyRequest) throws RequestValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseMessageResponse process(BaseMessageRequest baseMessageRequest) throws NotificationProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NotifyResponse postProcess(BaseMessageResponse baseMessageResponse)
			throws NotificationPostProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
