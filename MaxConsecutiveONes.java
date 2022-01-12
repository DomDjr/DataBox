package javaCode;

public class MaxConsecutiveONes {
	public static void main (String [] args) {
		int [] nums = new int[6];
		
		int maxOnes = 0;
		int conMaxOnes = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0 + (int)(2 * Math.random());
			System.out.print("[ " + nums[i] + " ]");
			if (nums[i] == 1) {
				maxOnes ++;
				if (maxOnes > conMaxOnes) {
					conMaxOnes = maxOnes;
				}
				
			}
			else if (nums[i] == 0) {
				maxOnes = 0;
			}
			
		}
		System.out.print("\n" + "The number of consecutive ones in the list are " + conMaxOnes);
	
	}

}
