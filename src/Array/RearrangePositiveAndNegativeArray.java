package Array;

import java.util.ArrayList;
import java.util.List;

public class RearrangePositiveAndNegativeArray {	
	    public static int[] rearrangeArray(int[] nums) {
	        List<Integer> positive = new ArrayList<>();
	        List<Integer> negative = new ArrayList<>();
	        
	        // Separate positive and negative integers
	        for (int num : nums) {
	            if (num > 0) {
	                positive.add(num);
	            } else {
	                negative.add(num);
	            }
	        }
	        int[] reArrangeArray = new int[nums.length];
	        int j=0;
	        for(int i=0; i<positive.size(); i++) {
	        	
	        	reArrangeArray[j] = positive.get(i);
	        	j++;
	        	reArrangeArray[j] = negative.get(i);
	        	j++;

	        	
	        }
	        return reArrangeArray;

	        
	      
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {-1,1};
	        int[] rearranged = rearrangeArray(nums);
	        
	        // Print the rearranged array
	        for (int num : rearranged) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); // New line
	    }
	


}
