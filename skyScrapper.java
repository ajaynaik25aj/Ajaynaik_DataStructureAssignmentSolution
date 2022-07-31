package binarytree;

import java.util.Scanner;

public class skyScrapper {
	private static int i;

	public static void main(String[] args) {

	System.out.println("Enter the total number of floors of the building");
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	
	//System.out.println("size of the floor for day is:");
	
	for(int i=0;i<n;i++){
		System.out.println("Enter the floor size given on day:"+(i+1));
		arr[i]=sc.nextInt();
	}
	System.out.println("the construction of the building goes as follows");
	
	 
	
	{  
        
        //int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[0] > arr[i])  
            System.out.println("day"+(i)+" is "+arr[i]);  
          } 
       
    }
	}
	}


 	  
	
	
	



	
	





