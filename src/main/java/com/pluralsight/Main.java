package com.pluralsight;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] listOfNum = {96, 93, 40, 100, 97, 92, 95, 98, 94, 90};
//        for (int i = 0; i < 10; i++)
//        {
//            listOfNum[i] = (int)((Math.random() * 10 ) + 1);
//        }
        int totalNum = 0;
        int highest = listOfNum[0];
        int lowest = listOfNum[0];

        for (int i = 0; i < 10; i++)
        {
            totalNum += listOfNum[i];
            if (listOfNum[i] > highest)
            {
                highest = listOfNum[i];
            }
            if (listOfNum[i] < lowest)
            {
                lowest = listOfNum[i];
            }
        }

        double average = totalNum / 10.0;
        System.out.printf("Average: %.2f\nHigh Score: %d\nLow Score: %d\n", average, highest, lowest);

        double median = 0.0;
        Arrays.sort(listOfNum);
        int lengthOfList = listOfNum.length;
        median += (listOfNum[lengthOfList/2 - 1] + listOfNum[lengthOfList/2])/2.0;

        System.out.println("The median is: " + median);
        System.out.println("The difference between the average and median is " + (median - average));

    }
}
