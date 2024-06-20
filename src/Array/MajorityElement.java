package Array;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,43,2,2,3,4,5,3};
		
		int max=nums[0];
		int maxcount=1;
	    for(int i=0;i<nums.length;i++){
	        int count=1;
	        for(int j=0;j<nums.length;j++){
	            if(nums[i]==nums[j] && i!=j){
	                count++;

	            }
	        }
	        if(maxcount<count){
	            maxcount=count;
	            max=nums[i];
	        }

	    }
	    System.out.print(max);
		System.out.println(majorityElement(nums));
	    
	}
	// applicable only majority element is greater than n/2
	  public static int majorityElement(int[] nums) {
	        int candidate = nums[0];
	        int count = 1;
	        
	        for (int i = 1; i < nums.length; i++) {
	            if (count == 0) {
	                candidate = nums[i];
	                count = 1;
	            } else if (nums[i] == candidate) {
	                count++;
	            } else {
	                count--;
	            }
	        }
	        
	        return candidate;
	    }
	  
	
}
