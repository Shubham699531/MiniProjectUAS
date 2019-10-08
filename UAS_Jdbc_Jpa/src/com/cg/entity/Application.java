package com.cg.entity;

import java.util.Date;

public class Application {
	private int applicationId;
	private String fullName;
	private Date dateOfBirth;
	private String highestQualification;
	private double marksObtained;
	private String goals;
	private String mailId;
	private int applicantScheduledProgramId = 1;
	private String status = "Registered";
	private Date dateOfInterview = new Date();
	
	
	private ProgramsScheduled program;
	
	public Application() {
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getScheduledProgramId() {
		return applicantScheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.applicantScheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	
}
