package sort;

import Util.SortUtil;

public class SelectSort {
	SortUtil su=new SortUtil();
	//选择排序算法，它的外循环是轮数，也可以说是一次从前到后为每一位选择值，内循环是选取这个值的过程
	//时间复杂度是o(n^2),空间复杂度是O(1)
	public int[] selectSort(int[] nums){
	    for(int i=0;i<nums.length-1;i++){
	    	int min=i;
	    	for(int j=i+1;j<nums.length;j++)
	    		if(nums[j]<nums[min])//不稳定，其不稳定如5 8 5 2 9
	    			min=j;
	    	if(min!=i)
	    	  su.swap(nums, i, min);
	    }
		return nums;	
	}
}
