package com.unit.testing.unittesting.business;

import com.unit.testing.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService SomeDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        SomeDataService = someDataService;
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = SomeDataService.retrieveAllData();
        for (int value : data) {
            sum += value;
        }

        //someDataService.storeSum(sum);


        return sum;
    }
}