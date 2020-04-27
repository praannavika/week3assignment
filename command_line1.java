import java.util.Scanner;
//package com.sapient.problems;

public class command_line1 {
  
    	void displaydata(int arr[], int n1) {
    		int sum=0; 
    		//int n1=arr.length;
        	for(int i=0;i<n1;i++)
        	{ 
        		Scanner sc = new Scanner(System.in);
            int n2 = sc.nextInt();
            arr[i]=n2;
        	}
   		for(int i=0;i<n1;i++)
    		{
    		sum=sum+arr[i];
    		}
    		int avg=sum/n1;
    		int min=arr[0];
    		int max=arr[0];
    		for(int i=0;i<n1;i++)
    		{
    			if(arr[i]>max)
    				max=arr[i];
    			if(arr[i]<min)
    				min=arr[i];
    		}
    		System.out.println("sum of the numbers is"+" "+sum);
    		System.out.println("average of the numbers is"+" "+avg);
    		System.out.println("maximun of all is"+" "+max);
    		System.out.println("minimun of all is"+" "+min);
    		
    		
    	}
    	
    }
	

