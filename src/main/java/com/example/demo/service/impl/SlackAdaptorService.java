package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.request.SlackMessageRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;
import com.example.demo.service.IAdaptorService;

@Service("slackAdaptorService")
public class SlackAdaptorService implements IAdaptorService<SlackMessageRequest> {

	@Override
	public SlackMessageRequest convert(NotifyRequest notifyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NotifyResponse convert(BaseMessageResponse baseMessageResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
