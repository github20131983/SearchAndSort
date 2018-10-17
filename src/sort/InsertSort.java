package sort;

import Util.SortUtil;

public class InsertSort {
	SortUtil su=new SortUtil();
	//插入排序算法，外层循环仍然是排序的轮数，内层循环是插入的过程
	//时间复杂度是o(n^2),空间复杂度是O(1)
	public int[] insertSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int j=i;
			while(j>0&&nums[j]<nums[j-1]){//稳定
				su.swap(nums, j, j-1);
				j--;
			}
		}		
		return nums;	
	}

	//改进的排序插入算法，在寻找插入位置的过程中使用二分查找
	public int[] improvedInsertSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int temp=nums[i];
			int left=0,right=i-1;
			while(left<=right){
				int mid=left+(right-left)/2;
				if(nums[mid]<=temp)
					left=mid+1;
				else 
					right=mid-1;
			}
			for(int j=i;j>right+1;j--)
				nums[j]=nums[j-1];
			nums[right+1]=temp;
		}	
		return nums;	
	}
}
