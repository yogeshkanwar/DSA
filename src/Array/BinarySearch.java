package Array;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5,8,9,56};
		int i=0;
		int j=a.length-1;
		int search = 4;
		
		while(i <= j) {
			int mid = (i+j)/2;
			if(a[mid] == search) {
				System.out.printf("%d is found at %dth position",search,mid+1);
				break;
			} else if(a[mid] > search) {
				j=mid - 1;
			} else {
				i=mid + 1;
			}
									
		}
		
	}

}
