package sort;

import Util.SortUtil;

public class BubbleSort {
	SortUtil su=new SortUtil();
	//冒泡排序,它的外循环是排序的轮数，内循环是每一轮的相邻数据的两两比较
	//时间复杂度是o(n^2),空间复杂度是O(1)
	public int[] bubbleSort(int[] nums){
		for(int i=0;i<nums.length-1;i++)
			for(int j=0;j<nums.length-i-1;j++)
				if(nums[j]>nums[j+1])//稳定
				    su.swap(nums,j,j+1);
		return nums;	
	}

	//改进的冒泡排序算法，改进之处在于如果某一轮没有发生过交换，那么就是后边的都有序了，就不需要再排了
	//时间复杂度是o(n^2),空间复杂度是O(1)
	public int[] improvedBubbleSort(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			boolean flag=true;
			for(int j=0;j<nums.length-i-1;j++)
				if(nums[j]>nums[j+1]){//稳定
				    su.swap(nums,j,j+1);
				    flag=false;
				}
			if(flag)
			   break;
		}
		return nums;	
	}
}
