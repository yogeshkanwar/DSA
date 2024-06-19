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
	        
	        // Interleave positive and negative integers
	        List<Integer> result = new ArrayList<>();
	        int i = 0, j = 0;
	        boolean turnPositive = true;
	        
	        // Start with a positive number
	        if (!positive.isEmpty() && !negative.isEmpty()) {
	            result.add(positive.get(0));
	            turnPositive = false;
	            i++;
	        }
	        
	        // Interleave
	        while (i < positive.size() && j < negative.size()) {
	            if (turnPositive) {
	                result.add(positive.get(i));
	                i++;
	            } else {
	                result.add(negative.get(j));
	                j++;
	            }
	            turnPositive = !turnPositive;
	        }
	        
	        // Append remaining elements if any
	        while (i < positive.size()) {
	            result.add(positive.get(i));
	            i++;
	        }
	        while (j < negative.size()) {
	            result.add(negative.get(j));
	            j++;
	        }
	        
	        // Convert List<Integer> to int[]
	        int[] resultArray = new int[result.size()];
	        for (int k = 0; k < result.size(); k++) {
	            resultArray[k] = result.get(k);
	        }
	        
	        return resultArray;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, -1, 2, -2, 3, -3, 4, -4};
	        int[] rearranged = rearrangeArray(nums);
	        
	        // Print the rearranged array
	        for (int num : rearranged) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); // New line
	    }
	


}
