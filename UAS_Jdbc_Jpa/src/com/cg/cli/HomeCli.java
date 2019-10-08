package com.cg.cli;

import java.util.Scanner;

public class HomeCli {
	private static Scanner console;
	static{
		console = new Scanner(System.in);
	}
	public static void main(String[] args) {
		int option = 0;
		while(true){
			System.out.println("First let us know who you are:");
			System.out.println("1-Applicant");
			System.out.println("2-Member of Administration Committee");
			System.out.println("3-Administrator");
			System.out.println("4-Exit");
			System.out.println("Enter option: ");
			option = console.nextInt();
			
			switch(option){
			case 1 : StudentCli.studentDisplay(); break;
			case 2 : MacCli.macDisplay(); break;
			case 3 : AdminCli.adminDisplay(); break;
			case 4 : System.exit(0);
			default : System.out.println("Please select correct option");
			}
		}
	}

}
