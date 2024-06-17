package Array;

public class MoveAllZeroAtTheEnd {
	public static void main(String[] args) {
		int[] a = {0,1, 0, 0, 0, 3, 0,2,0,0,0,5,2,0,0,5};
		int j=a.length-1;
		for(int i=0 ;i<j; i++) {
			if(a[i]==0){
				while(j>i && a[j] == 0) {
					j--;
				}
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j--;
				
			}		
		}	
		for(int i=0 ;i<a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}


}
