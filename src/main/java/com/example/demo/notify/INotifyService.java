package com.example.demo.notify;

import com.example.demo.model.request.BaseMessageRequest;
import com.example.demo.model.response.BaseMessageResponse;

/**
 * This package should be deployed as a separate service which will be used 
 * by the RabbitMQ consumer. Because we need to implement Asynchronous processing here
 * to improve the performance of the notification system.
 * This RabbitMQ consumer will be responsible for sending the appropriate message
 * 
 * @author Prachi Gupta
 *
 */

public interface INotifyService {
	
	BaseMessageResponse sendMessage(BaseMessageRequest baseMessageRequest);
}
