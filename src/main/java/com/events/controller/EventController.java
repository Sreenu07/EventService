package com.events.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.entity.Events;
import com.events.service.EventsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/events")
@Api(value="/events",produces ="application/json")
public class EventController {

	@Autowired
	private EventsService eventsService;

	@ApiOperation(value="Get Events",response=Events.class)
    @ApiResponses(value={
    @ApiResponse(code=200,message="Events Details Retrieved",response=Events.class),
    @ApiResponse(code=500,message="Internal Server Error"),
    @ApiResponse(code=404,message="Events not found")
    })
	@GetMapping("/{uuid}")
	public List<Events> getEventsOfEmployee(@PathVariable(value = "uuid")String uuid) {
		return eventsService.getEventsOfEmployee(uuid);
	}
}
