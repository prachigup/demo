To implement the notification system we must implement a asynchronous approach. 

The system exposing the API to send a notification is decoupled with the system actually sending the messages.

To do this a mircoservice will be exposing the API to send the notification. It will validate and process the message request to convert it into respective request format required for sending a particular type of message.

Then the service sending a type of message is deployed seperatly. 

These all services will communicate using RabbitMQ.

After recieveing a messageRequest, the respective service will validate, pre-process it and pushes it into correct RqbbitMQ queue.

Now from RabbitMQ respective consumers will consume and will do the processing to actually send the message.

The order of sending of messages will be maintained using the same rabbitMQ queue.

See "NotificationController" for the notify Api

To test:

hit /notify path with Post HTTP request type and payload "NotifyRequest"

Also see the TODO comments 