package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.services.GetInputs;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GetInputs gl = new GetInputs();
		int choice = 0;
		int noOfCompanies;
		
		System.out.println("Enter the no of companies");
		noOfCompanies = sc.nextInt();
		GetInputs.getUserInputs(noOfCompanies, sc, choice);	
	}
}
		

