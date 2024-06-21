package Array;

public class KadaneAlgorithm {
	 public static void main(String[] args) {
	       int[] a = {-2,-3,4,1,-2,9};
	       
	       int allMax = a[0];
	       int max=a[0];
	       
	       for(int i=0; i<a.length; i++) {
	    	   if(a[i]  > allMax + a[i]) {
	    		   allMax = a[i];
	    	   } else {
	    		   allMax = allMax + a[i];
	    	   }
	    	   
	    	   if(allMax > max) {
	    		   max = allMax;
	    	   }
	       }
	       System.out.println(max);
	 }

}
