package com.events.service;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import com.events.entity.Events;

@Component
public class RabbitMQConsumer {
	
	@Autowired
	private EventsService eventsService;

	@RabbitListener(queues = "${employeeevent.rabbitmq.queue}")
	public void recievedMessage(com.events.beans.EmployeeEvent employeeEvent) {
		Events event = new Events();
		event.setCreationTime(new Date());
		event.setEmployeeId(employeeEvent.getUuid());
		event.setEventName(employeeEvent.getEventName());
		eventsService.createEvent(event);
		
		
	}
}
