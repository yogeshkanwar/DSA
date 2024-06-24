package Array;

import java.util.ArrayList;
import java.util.List;

//we have to get element whose right element is smaller than it
public class LeadersInArray {
	
	 public static void main(String[] args) 
	    {
		 
	        int arr[] = new int[]{1, 7, 2, 3, 4, 5, 6};
	        List<Integer> leader = new ArrayList<>();
	        for(int i=0; i< arr.length; i++) {
	        	int temp=1;
	        	for(int j=i+1; j<arr.length; j++) {
	        		if(arr[i]<arr[j]) {
	        			temp=0;
	        			break;
	        		}
	        	}
	        	if(temp==1) {
	        		leader.add(arr[i]);
	        	}
	        }
	     for(Integer a : leader) {
	    	 System.out.print(" " +a);
	     }

	 }

}
