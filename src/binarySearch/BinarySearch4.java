package binarySearch;

public class BinarySearch4 {
	//二分搜索变种，寻找第一个大于目标元素的位置
	public int binarySearch(int[] nums,int x){
		int left=0,right=nums.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]<=x)
				left=mid+1;
			else 
				right=mid-1;
		}
		if(right+1>=nums.length)return -1;
		return right+1;
	}
}
