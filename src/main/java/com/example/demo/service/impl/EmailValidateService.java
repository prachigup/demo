package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.request.EmailMessageRequest;
import com.example.demo.service.IValidateService;

@Service("emailValidateService")
public class EmailValidateService implements IValidateService<EmailMessageRequest> {

	@Override
	public boolean validateMessage(EmailMessageRequest emailMessageRequest) {
		// TODO Auto-generated method stub
		
		//validations required for a email message request will be implemented here.
		return false;
	}

}
