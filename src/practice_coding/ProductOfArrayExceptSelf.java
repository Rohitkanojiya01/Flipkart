package practice_coding;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(ProductArrayExceptSelf(arr)));

	}
	
	public static int[] ProductArrayExceptSelf(int[] nums) {
		
		int n = nums.length;
		int[] prefix = new int[n];				// Product of all elements before self
		int[] suffix = new int[n];				// Product of all elements after self
		int[] ans = new int[n];				    // product of prefix * suffix 
		
		prefix[0] = 1 ;							// Prefix of first element 	
		
		for(int i=1;i<n;i++) {
			 
			prefix[i] = prefix[i-1]*nums[i-1];	// 	calculating prefix
		}
		
		suffix[n-1] = 1 ;						// suffix of last element
		
		for(int i=n-2;i>=0;i--) {
			
			suffix[i]=suffix[i+1]*nums[i+1];	// Calculating suffix
		}
		
		for(int i=0;i<n;i++) {
			
			ans[i]=prefix[i]*suffix[i];			// prefix * suffix
		}
				
		return ans;
	}
}
