package com.example.demo.service;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.request.NotifyRequest;
import com.example.demo.model.response.BaseMessageResponse;
import com.example.demo.model.response.NotifyResponse;

/**
 * This adaptor service will be used to convert NotifyRequest and Response to BaseMessageRequest and Response.
 * 
 * @author Prachi Gupta
 *
 */
public interface IAdaptorService<T extends BaseMessageRequest> {

	T convert(NotifyRequest notifyRequest);
	
	NotifyResponse convert(BaseMessageResponse baseMessageResponse );
}
