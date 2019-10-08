package com.cg.service;

import java.util.Date;
import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsOffered;
import com.cg.entity.ProgramsScheduled;
import com.cg.exception.StudentAlreadyExistException;

public class AdminServiceImpl implements AdminService {

	public ProgramsOffered createNewProgram(ProgramsOffered programToBeOffered) {
		return null;
	}

	public List<ProgramsOffered> retrieveAllPrograms() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProgramsOffered retrieveAProgram(int programId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProgramsOffered updateAnOfferedProgram(ProgramsOffered offeredProgramToBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProgramsOffered> programsBetweenTwoDates(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Application> listOfParticipantsAlongWithStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAProgram(int programId) throws StudentAlreadyExistException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProgramsScheduled scheduleAProgram(ProgramsOffered programToBeScheduled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgramsScheduled updateAScheduledProgram(ProgramsScheduled scheduledProgramToBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

}
