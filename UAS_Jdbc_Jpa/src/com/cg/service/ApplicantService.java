package com.cg.service;

import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsScheduled;

public interface ApplicantService {
	
	List<ProgramsScheduled> listAllScheduledPrograms();
	
	Application retrieveApplicationStatus(int applicantId);
	
	int applyOnline(Application application, int scheduledProgramId);	

}
