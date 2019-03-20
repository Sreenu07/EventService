package com.events.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.events.dao.EventRepository;
import com.events.entity.Events;


@Service
@Transactional
public class EventsServiceImpl implements EventsService {
	
	@Autowired
	EventRepository eventRepository;

	@Override
	public Events createEvent(Events event) {
		event.setCreationTime(new Date());
		return eventRepository.save(event);
	}

	@Override
	public List<Events> getEventsOfEmployee(String eventid) {
		List<Events> events = new ArrayList<>();
		events = eventRepository.getByIdAsc(eventid);
		return events;
	}
}
