package Array;

/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 *  and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 */

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
	       int[] m = {1,4,6,8,0,0,0};
	       int[] n = {2,4,6};
	       int i=m.length - n.length;

	       //  step 1 first add second array to first array
    	   for(int j=0;j <n.length; j++) {
    		   m[i] = n[j];
    		   i++;
    	   }
    	   // step 2
    	   // sort the array
    	   for(int k=0; k < m.length;k++) {
	    	   for(int j=k+1; j< m.length; j++) {
	    		   if(m[k] > m[j]) {
	    			   int temp = m[k];
	    			   m[k] = m[j];
	    			   m[j] = temp;
	    		   }
	    	   }
	       }    	   
    	   for(int l=0;l <m.length; l++) {
	    	   System.out.print(" " + m[l]);
    	   }
     
	}

}
