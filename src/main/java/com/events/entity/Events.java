package com.events.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEE_EVENTS")
public class Events {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EMPLOYEE_EVENT_ID", unique = true, nullable = false)
	private int employeeEventId;
	@Column(name = "EMPLOYEE_ID", nullable = false)
	private String employeeId;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_TIME", nullable = false)
	private Date creationTime;
	@Column(name = "EVENT_NAME")
	private String eventName;



	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
