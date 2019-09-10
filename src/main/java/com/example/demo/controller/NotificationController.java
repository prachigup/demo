package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.NotificationPostProcessingException;
import com.example.demo.Exception.NotificationProcessingException;
import com.example.demo.Exception.RequestValidationException;
import com.example.demo.constants.MessageType;
import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;
import com.example.demo.service.IProcessMessageService;
import com.example.demo.service.impl.MessageProcessServiceFactory;

@RestController
public class NotificationController {
	
	@Autowired
	private MessageProcessServiceFactory MessageProcessServiceFactory;
	
	@RequestMapping(value="/notify", method = RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NotifyResponse> notify(@RequestBody NotifyRequest notifyRequest) 
			throws RequestValidationException, NotificationProcessingException, NotificationPostProcessingException{
		
		NotifyResponse notifyResponse  = new NotifyResponse();
		
		if(StringUtils.isEmpty(notifyRequest.getMessageType()) || 
				MessageType.valueOf(notifyRequest.getMessageType()) == null){
			 
			//TODO: In the Exception Handling we can return the response entity with the message and result code in the Exception.
			throw new RequestValidationException("400FC", "Request is null or the message type is invalid");
		}
		
		IProcessMessageService messageProcessService = MessageProcessServiceFactory.getMessageProcessFactory
				(MessageType.valueOf(notifyRequest.getMessageType()));
	
		BaseMessageRequest baseMessageRequest = messageProcessService.preProcess(notifyRequest);
		BaseMessageResponse baseMessageResponse = messageProcessService.process(baseMessageRequest);
		notifyResponse = messageProcessService.postProcess(baseMessageResponse);
		
		return new ResponseEntity<NotifyResponse>(notifyResponse, HttpStatus.OK);
	}

}
