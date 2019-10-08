package com.cg.service;

import java.util.List;

import com.cg.dao.ApplicantDao;
import com.cg.dao.ApplicantDaoImpl;
import com.cg.entity.Application;
import com.cg.entity.ProgramsScheduled;

public class ApplicantServiceImpl implements ApplicantService {

	private ApplicantDao dao = new ApplicantDaoImpl();
	
	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		return dao.listAllScheduledPrograms();
	}

	@Override
	public Application retrieveApplicationStatus(int applicantId) {
		return dao.retrieveApplicationStatus(applicantId);
	}

	@Override
	public int applyOnline(Application app, int scheduledProgramId) {
		return dao.applyOnline(app,scheduledProgramId);
	}

}
