package Array;

/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 *  and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 */

public class SortArray {
	
	 public static void main(String[] args) {
	       int[] a = {7,5,4,6,8,2,1};
	       
	       for(int i=0; i < a.length; i++) {
	    	   for(int j=i+1; j< a.length; j++) {
	    		   if(a[i] > a[j]) {
	    			   int temp = a[i];
	    			   a[i] = a[j];
	    			   a[j] = temp;
	    		   }
	    	   }
	       }
	       for(int i=0; i < a.length; i++) {
	    	   System.out.print(" " +a[i]);
	       }
	       
	   }

}
