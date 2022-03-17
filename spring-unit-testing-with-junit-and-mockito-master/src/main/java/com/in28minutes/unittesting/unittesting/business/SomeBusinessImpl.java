package com.in28minutes.unittesting.unittesting.business;

import java.util.Arrays;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

	private SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}

	public int calculateSumUsingDataService() {
		int[] data = someDataService.retrieveAllData();
		// someDataService.storeSum(sum);
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}

}
