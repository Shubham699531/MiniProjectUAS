package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Programs_Offered")
public class ProgramsOffered {
	@Column(name = "program_name", length = 30)
	private String programName;
	@Column(length = 30)
	private String description;
	@Column(name = "applicant_eligibility", length = 30)
	private String applicantEligibility;
	@Column(length = 30)
	private int duration;
	@Column(name = "degree_certificate_offered", length = 30)
	private String degreeCertificateOffered;
}
