package com.cg.dao;

import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsScheduled;

public interface ApplicantDao {
	
	List<ProgramsScheduled> listAllScheduledPrograms();
	
	Application retrieveApplicationStatus(int applicantId);
	
	int applyOnline(Application app, int scheduledProgramId);
	
	String registerApp = "insert into application values(seq_app.nextval, ?,?,?,?,?,?,?,?,?)";
	
	String getAllQuery = "select * from program_scheduled";
	
	String getOneQuery = "select * from application where id=?";
		
	String seqQuery = "select seq_app.currval from dual";

}
