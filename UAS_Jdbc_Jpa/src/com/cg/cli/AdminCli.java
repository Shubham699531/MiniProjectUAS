package com.cg.cli;

import java.util.Scanner;

public class AdminCli {
	private static Scanner console;
	static{
		console = new Scanner(System.in);
	}
	public static void adminDisplay() {
		
		System.out.println("Please Login to Continue!");
		System.out.println();
		System.out.println("Enter User Name: ");
		String userName = console.nextLine();
		System.out.println("Enter Password: ");
		String password = console.nextLine();
		
		/*boolean b = service.validateAdminLogin(userName,password);
		*if(b){then run below code...}*/
		
		int option = 0;
		while(true){
			System.out.println("Welcome Admin!");
			System.out.println();
			System.out.println();
			System.out.println("1-Create a program");
			System.out.println("2-Retrieve a program");
			System.out.println("3-Retrieve all programs");
			System.out.println("4-Update a program");
			System.out.println("5-Delete a program");
			System.out.println("6-Find programs between two dates");
			System.out.println("7-Get list of all participants along with status");
			System.out.println("8-System-exit");
			System.out.println("Enter option: ");
			option = console.nextInt();
			
			switch(option){
			case 1 : createProgram(); break;
			case 2 : retrieveAProgram(); break;
			case 3 : retrieveAllProgram(); break;
			case 4 : updateAProgram(); break;
			case 5 : deleteAProgram(); break;
			case 6 : getProgramBetween(); break;
			case 7 : getListOfParticipants(); break;
			case 8 : System.exit(0); break;
			default : System.out.println("Please select correct option");
			}
		}
	}
	private static void getListOfParticipants() {
		// TODO Auto-generated method stub
		
	}
	private static void getProgramBetween() {
		// TODO Auto-generated method stub
		
	}
	private static void deleteAProgram() {
		// TODO Auto-generated method stub
		
	}
	private static void updateAProgram() {
		// TODO Auto-generated method stub
		
	}
	private static void retrieveAllProgram() {
		// TODO Auto-generated method stub
		
	}
	private static void retrieveAProgram() {
		// TODO Auto-generated method stub
		
	}
	private static void createProgram() {
		// TODO Auto-generated method stub
		
	}

}
