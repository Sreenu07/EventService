package com.events.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.events.entity.Events;

public interface EventRepository extends CrudRepository<Events, Integer> {
	 @Query("select e from Events e where e.employeeId =:id order by e.creationTime asc")
	 public List<Events> getByIdAsc(String id);
}
