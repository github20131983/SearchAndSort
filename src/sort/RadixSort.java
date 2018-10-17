package sort;

public class RadixSort {
	//基数排序
	public void radixHelp(int[] a, int exp) {
	    int[] output = new int[a.length];   
	    int[] buckets = new int[10];

	    for (int i = 0; i < a.length; i++)
	        buckets[ (a[i]/exp)%10 ]++;

	    for (int i = 1; i < 10; i++)
	        buckets[i] += buckets[i - 1];

	    for (int i = a.length - 1; i >= 0; i--) {
	        output[buckets[ (a[i]/exp)%10 ] - 1] = a[i];
	        buckets[ (a[i]/exp)%10 ]--;
	    }

	    for (int i = 0; i < a.length; i++)
	        a[i] = output[i];
	}
	
	public int[] radixSort(int nums[]){
		int exp; 
		int max = nums[0]; 
		for(int i=0;i<nums.length;i++)
			max=Math.max(nums[i], max);
	    for (exp = 1; max/exp > 0; exp *= 10)
	    	radixHelp(nums, exp);
		return nums;
	}
}
