package com.events.service;

import java.util.List;

import com.events.entity.Events;

public interface EventsService {
	
	public Events createEvent(Events events);
	public List<Events> getEventsOfEmployee(String eventid);

}
