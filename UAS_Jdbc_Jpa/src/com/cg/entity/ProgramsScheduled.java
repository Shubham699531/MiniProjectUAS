package com.cg.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProgramsScheduled {
	private int scheduledProgramId;
	private String programName;
	private String location;
	private Date startDate;
	private Date endDate;
	private int sessionPerWeek;
	
	Set<Application> applications = new HashSet<Application>();
	
	public ProgramsScheduled() {
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSessionPerWeek() {
		return sessionPerWeek;
	}

	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}
	
}
