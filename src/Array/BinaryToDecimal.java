package Array;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// binary to decimal
		Integer binary = 101;  double decimal=0;
		String num = binary.toString();
		int n = num.length()-1;
		
		for(int i=0 ; i<num.length(); i++) {
			 int digit = num.charAt(i) - '0'; 
	         decimal = decimal + (digit * Math.pow(2, n));
	         n--;
		
		}
		System.out.println(decimal);	
	}
	

}
