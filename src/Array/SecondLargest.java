package Array;

public class SecondLargest {
	public static void main(String[] args) {
		// find second largest
	    int[] a = {1, 2, 545, 345, 54, 3, 54};
	    int largest = a[0], secondLargest = a[0];
	
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > largest) {
	            secondLargest = largest;
	            largest = a[i];
	        } else if (a[i] > secondLargest && a[i] != largest) {
	            secondLargest = a[i];
	        }
	    }
	    System.out.println(secondLargest);
	}	
	

}
