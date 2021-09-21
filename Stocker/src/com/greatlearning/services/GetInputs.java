package com.greatlearning.services;

import java.util.Scanner;

public class GetInputs {
	
public static void getUserInputs(int noOfCompanies, Scanner sc, int choice) {
	double currentStockPriceArr[] =  new double[noOfCompanies]; 
	boolean stockPriccestatusArr[] =  new boolean[noOfCompanies]; 
	Sorting sort = new Sorting();
	Searching search = new Searching();
	stockStatus stock = new stockStatus();
	
	for(int i=0; i < noOfCompanies; i++) {
		
		System.out.println("Enter current stock price of the company: "+ (i+1));
		double currentStockPrice = sc.nextDouble();
		currentStockPriceArr[i] = currentStockPrice;
		// 
		System.out.println("Whether company's stock price rose today compare to yesterday?");
		boolean stockPrice = sc.nextBoolean();
		stockPriccestatusArr[i] = stockPrice;
		
	}
	do {
		System.out.println("-----------------------------------------------\r\n"
				+ "Enter the operation that you want to perform\r\n"
				+ "1. Display the companies stock prices in ascending order\r\n"
				+ "2. Display the companies stock prices in descending order\r\n"
				+ "3. Display the total no of companies for which stock prices rose today\r\n"
				+ "4. Display the total no of companies for which stock prices declined today\r\n"
				+ "5. Search a specific stock price\r\n"
				+ "6. press 0 to exit\r\n"
				+ "-----------------------------------------------");
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				//1. Display the companies stock prices in ascending order
				// Used the Merge sort for both order and status is kept as true
				sort.sort(currentStockPriceArr, 0, currentStockPriceArr.length-1, true);
				for(int i = 0; i < currentStockPriceArr.length; i++) {
					System.out.print(currentStockPriceArr[i]+ " ");
				}
				System.out.println();
				break;
			case 2:
				//2. Display the companies stock prices in descending order
				// Used the Merge sort for both order and status is kept as false
				sort.sort(currentStockPriceArr, 0, currentStockPriceArr.length-1, false);
				for(int i = 0; i < currentStockPriceArr.length; i++) {
					System.out.print(currentStockPriceArr[i]+ " ");
				}
				System.out.println();
				break;
			
			case 3:
				//3. Display the total no of companies for which stock prices rose today
				System.out.println("Total no of companies whose stock price rose today : "+ stockStatus.stockStatus(stockPriccestatusArr, true));
				break;
			
			case 4:
				//4. Display the total no of companies for which stock prices declined today
				System.out.println("Total no of companies whose stock price declined today : "+ stockStatus.stockStatus(stockPriccestatusArr, false));
				break;
 			
			case 5:
				//5. Search a specific stock price
				System.out.println("enter the key value");
				double key = sc.nextDouble();
				int searchElement = Searching.binarySearchImplementation(currentStockPriceArr, 0, currentStockPriceArr.length-1, key);
				for(int i =0; i< currentStockPriceArr.length; i++) {
					System.out.print(currentStockPriceArr[i]);
				}
				System.out.println(searchElement+"===searchElement");
				if (searchElement == -1) {
					System.out.println("Value not found");
				}else{
					System.out.println("Stock of value "+ currentStockPriceArr[searchElement] +" is present.");
				}
				break;
			
			default:
				if(choice != 0) {
					System.out.println("Enter a value from the listed options.");
				}
				break;
			}
	}while(choice > 0);
	
	if(choice == 0) {
		System.out.println("Exited successfully");
	}
}

}
