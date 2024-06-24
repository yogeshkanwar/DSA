package Array;

public class KadaneAlgorithm {
	 public static void main(String[] args) {
	       int[] a = {-2,-3,4,1,-2,9};
	       
	       int allMax = a[0];
	        int max = a[0];
	        int start = 0;
	        int end = 0;
	        int currentStart = 0;

	        for (int i = 1; i < a.length; i++) {
	            if (a[i] > allMax + a[i]) {
	                allMax = a[i];
	                currentStart = i;
	            } else {
	                allMax = allMax + a[i];
	            }

	            if (allMax > max) {
	                max = allMax;
	                start = currentStart;
	                end = i;
	            }
	        }

	        // Print the maximum sum
	        System.out.println("Maximum sum of subarray: " + max);

	        // Print the subarray itself
	        System.out.print("Subarray with maximum sum: ");
	        for (int i = start; i <= end; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	    }
	 
   
}
