package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        int[] listOfNum = new int[10];
        for (int i = 0; i < 10; i++)
        {
            listOfNum[i] = (int)((Math.random() * 10 ) + 1);
        }
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
    }
}
