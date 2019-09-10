package com.example.demo.common;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.response.BaseMessageResponse;

public interface IProducer {

	BaseMessageResponse produceMessage(BaseMessageRequest baseMessageRequest);
}
