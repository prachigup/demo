package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.constants.MessageType;
import com.example.demo.service.IProcessMessageService;

@Component("messageProcessServiceFactory")
public class MessageProcessServiceFactory {
	
	@Autowired
	@Qualifier("emailMessageProcessService")
	private IProcessMessageService emailMessageProcessService;
	
	@Autowired
	@Qualifier("slackMessageProcessService")
	private IProcessMessageService slackMessageProcessService;
	
	public IProcessMessageService getMessageProcessFactory(MessageType messageType){
		switch (messageType) {
		case SLACK:
			return slackMessageProcessService;

		default:
			return emailMessageProcessService;
		}
		
	}

}
