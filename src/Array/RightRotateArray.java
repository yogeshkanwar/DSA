package Array;

public class RightRotateArray {
	// right rotate array by k positoion
	public static void main(String[] args) {
		int[] a = {1, 12, 3, 54,4,5};
		int[] b = new int[a.length];
		int k=3;
		int tempLength = a.length-k;
		for(int i=tempLength ; i<a.length;i++ ) {
			b[i - tempLength] = a[i];
		}
		for(int i=0 ; i<tempLength; i++ ) {
			b[i + tempLength] = a[i];
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j] + " ");
		}

	}

}
