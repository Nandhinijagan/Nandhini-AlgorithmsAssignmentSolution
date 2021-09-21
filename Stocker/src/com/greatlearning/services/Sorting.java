package com.greatlearning.services;

public class Sorting {

	public double[] sort(double[] currentStockPriceArr, int left, int right, boolean status) {
		// TODO Auto-generated method stub
		if(left < right) {
			int mid = left + right / 2;
			sort(currentStockPriceArr, left, mid, status);
			sort(currentStockPriceArr, mid+1, right, status);
			merge(currentStockPriceArr, left, mid, right, status);
		}
		return currentStockPriceArr;
	}
	
	//for ascending order ----status=true
	//for descending order ---status=false

	public void merge(double[] currentStockPriceArr, int left, int mid, int right, boolean status) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		double[] LeftArray = new double[n1];
		double[] RightArray = new double[n2];
		
		for (int i = 0;i < n1; i++)
			LeftArray[i] = currentStockPriceArr[left + i];
		for (int j = 0;j < n2; j++)
			RightArray[j] = currentStockPriceArr[mid + 1 + j];
		
		int i = 0, j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
		if (LeftArray[i] >= RightArray[j] && status== false) {
			currentStockPriceArr[k] = LeftArray[i];
			i++;
		}
		else if (LeftArray[i] <= RightArray[j]&& status== true) {
			currentStockPriceArr[k] = LeftArray[i];
			i++;
		}
		else {
			currentStockPriceArr[k] = RightArray[j];
			j++;
		}
			k++;
		}
		
		while (i < n1) {
			currentStockPriceArr[k] = LeftArray[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			currentStockPriceArr[k] = RightArray[j];
			j++;
			k++;
		}
	}
}
