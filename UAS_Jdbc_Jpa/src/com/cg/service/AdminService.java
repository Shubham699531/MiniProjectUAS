package com.cg.service;

import java.util.Date;
import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsOffered;
import com.cg.entity.ProgramsScheduled;
import com.cg.exception.StudentAlreadyExistException;

public interface AdminService {
	
	ProgramsOffered createNewProgram(ProgramsOffered programToBeOffered);
	
	List<ProgramsOffered> retrieveAllPrograms();
	
	ProgramsOffered retrieveAProgram(int programId);
	
	ProgramsOffered updateAnOfferedProgram(ProgramsOffered offeredProgramToBeUpdated);
	
	ProgramsScheduled updateAScheduledProgram(ProgramsScheduled scheduledProgramToBeUpdated);
	
	ProgramsScheduled scheduleAProgram(ProgramsOffered programToBeScheduled);
	
	boolean deleteAProgram(int programId) throws StudentAlreadyExistException;
	
	List<ProgramsOffered> programsBetweenTwoDates(Date startDate, Date endDate);
	
	List<Application> listOfParticipantsAlongWithStatus();
	
}
