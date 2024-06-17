package Array;

// array is sorted or not

public class ArraySortedOrNot {
	public static void main(String[] args) {
		int[] a = {1, 12, 3, 54};
		int n = a[0];
		boolean sort=true;
		 for (int i=1; i<a.length; i++) {
			 if(a[i] < n) {
				 sort = false;
				 break;
			 }
			 n=a[i];		 
		 }
		 System.out.println(sort);
		
	}


}
