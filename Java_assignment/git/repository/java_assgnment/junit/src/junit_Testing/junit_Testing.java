package junit_Testing;

import java.util.Arrays;

public class junit_Testing 
{
     public int array()
     {  
    	 int a[]=new int[2];
    	int arr[]= {1,3,2,4,5,6};
    	Arrays.sort(arr);
    	a[0]=arr[0];
    	a[1]=arr[5];
    	return a[1];
    	
     }
}
