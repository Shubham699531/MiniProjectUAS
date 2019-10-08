package com.cg.cli;

import java.util.Scanner;

public class MacCli {
	private static Scanner console;
	static{
		console = new Scanner(System.in);
	}
	
	public static void macDisplay() {
		System.out.println("Please Login to Continue!");
		System.out.println();
		System.out.println("Enter User Name: ");
		String userName = console.nextLine();
		System.out.println("Enter Password: ");
		String password = console.nextLine();
		
		/*boolean b = service.validateMacLogin(userName,password);
		*if(b){then run below code...}*/
		
		int option = 0;
		while(true){
			System.out.println("Welcome MAC!");
			System.out.println();
			System.out.println();
			System.out.println("1-Retrieve Applications for a Scheduled Program");
			System.out.println("2-Accept or Reject based on registration");
			System.out.println("3-Decide date of interview for selected students");
			System.out.println("4-Update status after interview");
			System.out.println("5-System-exit");
			System.out.println("Enter option: ");
			option = console.nextInt();
			
			switch(option){
			case 1 : retrieveApplicationsBasedOnProgram(); break;
			case 2 : statusAfterRegistration(); break;
			case 3 : setInterviewDate(); break;
			case 4 : updateStatusAfterInterview(); break;
			case 5 : System.exit(0); break;
			default : System.out.println("Please select correct option");
			}
		}
	}
	private static void updateStatusAfterInterview() {
		// TODO Auto-generated method stub
		
	}
	private static void setInterviewDate() {
		// TODO Auto-generated method stub
		
	}
	private static void statusAfterRegistration() {
		// TODO Auto-generated method stub
		
	}
	private static void retrieveApplicationsBasedOnProgram() {
		// TODO Auto-generated method stub
		
	}

}
