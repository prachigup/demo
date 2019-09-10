package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.EmailMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;
import com.example.demo.service.IAdaptorService;


@Service("emailAdaptorService")
public class EmailAdaptorService implements IAdaptorService<EmailMessageRequest> {

	@Override
	public EmailMessageRequest convert(NotifyRequest notifyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NotifyResponse convert(BaseMessageResponse baseMessageResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
