package com.cg.cli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.entity.Application;
import com.cg.entity.ProgramsScheduled;
import com.cg.service.ApplicantService;
import com.cg.service.ApplicantServiceImpl;

public class StudentCli {
	private static Scanner console;
	private static ApplicantService service = new ApplicantServiceImpl();
	
	static{
		console = new Scanner(System.in);
	}
	public static void studentDisplay() {
		int option = 0;
		while(true){
			System.out.println("1-Apply Online");
			System.out.println("2-Retrieve Application Status");
			System.out.println("3-Exit");
			System.out.println("Enter option: ");
			option = console.nextInt();
			
			switch(option){
			case 1 : applyOnline(); break;
			case 2 : knowApplicationStatus(); break;
			case 3 : System.exit(0); break;
			default : System.out.println("Please select correct option");
			}
		}
	}
	private static void knowApplicationStatus() {
		//relevant service to be called
		Application application = new Application();
		System.out.println("Enter your application Id: ");
		int option = console.nextInt();
		
		application = service.retrieveApplicationStatus(option);
		
		System.out.println(application.getApplicationId());
		System.out.println(application.getFullName());
		System.out.println(application.getStatus());
	}
	
	private static void applyOnline() {
		List<ProgramsScheduled> listOfPrograms = new ArrayList<ProgramsScheduled>();
		listOfPrograms = service.listAllScheduledPrograms();
		for(ProgramsScheduled program : listOfPrograms) {
			System.out.println("Program Id: " + program.getScheduledProgramId());
			System.out.println("Program Name: " + program.getProgramName());
			System.out.println("Location: " + program.getLocation());
			System.out.println("Start Date: " + program.getStartDate());
			System.out.println("End date: " + program.getEndDate());
			System.out.println("Sessions Per Week: " + program.getSessionPerWeek());
			System.out.println();
			System.out.println();
		}
		System.out.println("Enter program Id that you want to enroll to: ");
		int option = console.nextInt();
		
		System.out.println("Enter your personal details: ");
		Application application = new Application();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Your Name: ");
		String name = console.next();
		application.setFullName(name);
		
		System.out.println("Your Date of Birth: ");
		String dob = console.next();
		try {
			application.setDateOfBirth(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Your Highest Qualification: ");
		String highQual = console.next();
		application.setHighestQualification(highQual);
		
		System.out.println("Marks Obtained: ");
		double marks = console.nextDouble();
		console.nextLine();
		application.setMarksObtained(marks);
		
		System.out.println("Goals: ");
		String goals = console.next();
		application.setGoals(goals);
		
		System.out.println("Mail Id: ");
		String mailId = console.next();
		application.setMailId(mailId);
		
		application.setScheduledProgramId(option);
		
		int applyResult = service.applyOnline(application,option);
		
		if(applyResult!=0) {
			System.out.println("You have been successfully enrolled with application Id: "
					+ "!! " + applyResult);
			System.out.println("Please keep it for future references.");
		}
		else
			System.out.println("Something went wrong...");
		
	}

}
