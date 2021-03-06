package com.cg.entity;

public class ProgramsOffered {
	private int offeredProgramId;
	private String programName;
	private String description;
	private String applicantEligibility;
	private int duration;
	private String degreeCertificateOffered;
	
	
	public ProgramsOffered() {
	}

	
	public int getOfferedProgramId() {
		return offeredProgramId;
	}



	public void setOfferedProgramId(int offeredProgramId) {
		this.offeredProgramId = offeredProgramId;
	}



	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicantEligibility() {
		return applicantEligibility;
	}

	public void setApplicantEligibility(String applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	
}
