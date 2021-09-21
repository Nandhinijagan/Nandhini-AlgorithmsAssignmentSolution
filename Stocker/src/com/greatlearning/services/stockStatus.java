package com.greatlearning.services;

public class stockStatus {
	public static int stockStatus(boolean[] stockPriccestatusArr, boolean b) {
		// TODO Auto-generated method stub
		int count  = 0;
		for(int i =0; i< stockPriccestatusArr.length; i++) {
			 if(stockPriccestatusArr[i] == b){
				 count ++; 
			 }
		}
		return count;
	}
}
