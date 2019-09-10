package com.example.demo.common.impl;

import org.springframework.stereotype.Service;

import com.example.demo.common.IProducer;
import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.response.BaseMessageResponse;

@Service("rabbitMQProducer")
public class RabbitMQProducer implements IProducer {

	@Override
	public BaseMessageResponse produceMessage(BaseMessageRequest baseMessageRequest) {
		// TODO Auto-generated method stub
		return new BaseMessageResponse();
	}

}
