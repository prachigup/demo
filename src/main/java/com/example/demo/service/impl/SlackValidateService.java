package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.SlackMessageRequest;
import com.example.demo.service.IValidateService;

@Service("slackValidateService")
public class SlackValidateService implements IValidateService<SlackMessageRequest> {

	@Override
	public boolean validateMessage(SlackMessageRequest baseMessageRequest) {
		// TODO Auto-generated method stub
		
		//validations required for a slack message request will be implemented here.
		return false;
	}

}
