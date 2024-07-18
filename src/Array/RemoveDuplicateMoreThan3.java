package Array;

public class RemoveDuplicateMoreThan3 {
	
		public static void main(String[] args) {
			int[] a = {1,1,1,2,2,3,3,3,3,4,4};
			
			 int slow = 0;
		        int count = 1;

		        for (int fast = 1; fast < a.length; fast++) { 
		            if (a[fast] == a[fast - 1]) {
		                count++; 
		                if (count <= 2) {
		                    slow++; 
		                    a[slow] = a[fast]; 
		                }
		            } else {
		                count = 1; 
		                slow++; 
		                a[slow] = a[fast]; 
		            }
		        }

			
			for(int i=0; i<a.length; i++) {
				System.out.print( a[i] +" ");
			}
			
		}

	

}
