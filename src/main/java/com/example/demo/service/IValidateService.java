package com.example.demo.service;

import com.example.demo.model.request.BaseMessageRequest;

public interface IValidateService<T extends BaseMessageRequest> {
	
	 boolean validateMessage(T baseMessageRequest);

}
	