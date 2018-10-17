package binarySearch;

public class BinarySearch3 {
	//二分搜索变种，寻找元素最后一次出现的位置,只要卡着right不动,左边即使等于也让它往后移
	public int binarySearch(int[] nums,int x){
		int left=0,right=nums.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]<=x)
				left=mid+1;
			else 
				right=mid-1;
		}
		if(right>=0&&nums[right]==x)return right;
		return -1;
	}
}
