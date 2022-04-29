package com;


public class IntegerArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, };  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
           
        }  
        
        int smallest_element=arr[0]; //let, first element is the smallest one

        		for(int i =1;i<arr.length;i++)  
        		{
        		    if(arr[i]<smallest_element)
        		    {
        		     smallest_element=arr[i];
        		    }
        		}
        
        int average = sum/arr.length;
        System.out.println("Sum of all the elements of an array: " + sum);  
        System.out.println("Average of " +average);
        System.out.println("Smallest Element in this Array" +smallest_element);
    }  
}  
