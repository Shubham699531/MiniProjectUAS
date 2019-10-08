package com.cg.dao;

import java.util.Date;
import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsOffered;
import com.cg.entity.ProgramsScheduled;
import com.cg.exception.StudentAlreadyExistException;

public interface AdminDao {
	
ProgramsOffered createNewProgram(ProgramsOffered programToBeOffered);
	
	List<ProgramsOffered> retrieveAllPrograms();
	
	ProgramsOffered retrieveAProgram(int programId);
	
	ProgramsScheduled retrieveAScheduledProgram(int scheduledProgramId);
	
	ProgramsOffered updateAnOfferedProgram(ProgramsOffered offeredProgramToBeUpdated);
	
	ProgramsScheduled updateAScheduledProgram(ProgramsScheduled scheduledProgramToBeUpdated);
	
	//ProgramsScheduled scheduleAProgram(ProgramsOffered programToBeScheduled);
	
	boolean deleteAProgram(int programId) throws StudentAlreadyExistException;
	
	List<ProgramsOffered> programsBetweenTwoDates(Date startDate, Date endDate);
	
	List<Application> listOfParticipantsAlongWithStatus();
	
	String insertQuery = "insert into program_offered values(seq_prog_off.nextval,?,?,?,?,?)";
	
	String getAllQuery = "select * from program_offered";
	
	String getProgramById = "select * from program_offered where offered_program_id = ?";
	
	String getScheduledProgramById = "select * from program_scheduled where scheduled_program_id = ?";

	ProgramsScheduled scheduleAProgram(int programId, ProgramsScheduled programToBeScheduled);

}
