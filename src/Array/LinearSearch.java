package Array;

public class LinearSearch {
	   public static void main(String[] args) {
	       int[] a = {2,3,2,5,6,74,52,323};
	       int search = 324;
	       linearSearch(a,search);
	   }
	   
	   private static void linearSearch(int[] a,int search) {
		   for(int i = 0; i< a.length ; i++) {
			   if(a[i] == search) {
				   System.out.printf("%d found at %d index ",a[i],i+1);
				   break;
			   }
		   }
		   System.out.printf("Not found");
	   }
}
