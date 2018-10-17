package binarySearch;

public class BinarySearch2 {
	//二分搜索变种，寻找元素第一次出现的位置,只要卡着left不动，右边即使等于也让它往前移
	public int binarySearch(int[] nums,int x){
		int left=0,right=nums.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(left<=nums.length-1&&nums[mid]<x)
				left=mid+1;
			else 
				right=mid-1;
		}
		if(left<nums.length&&nums[left]==x)return left;//这里要注意
		return -1;
	}
}
