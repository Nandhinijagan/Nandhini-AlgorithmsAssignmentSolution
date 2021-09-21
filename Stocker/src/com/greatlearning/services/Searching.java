package com.greatlearning.services;

public class Searching {	
	   public static int binarySearchImplementation(double[] currentStockPriceArr, int left, int right, double key){
		      if (right >= left){
		         int mid = left + (right - left) / 2;
		         if (currentStockPriceArr[mid] == key)
		         return mid;
		         if (currentStockPriceArr[mid] > key)
		         return binarySearchImplementation(currentStockPriceArr, left, mid - 1, key);
		         return binarySearchImplementation(currentStockPriceArr, mid + 1, right, key);
		      }
		      return -1;
		   }
}