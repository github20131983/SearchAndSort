package binarySearch;
/*
 *二分搜索实际上是不断卡left和right的过程，卡到什么位置，取决于你的实际需求
 *如果是要取到第一个，那就要严格卡left，除非目标元素确实比它大，否则不移动左界
 *如果是要取最后一个，那就要严格卡right，除非目标元素确实比它小，否则不移动右界
*/
public class BinarySearch1 {
//正常的二分搜索，检索到那个数字为止，有重复的随机返回了
public int binarySearch(int[] nums,int x){
	int left=0,right=nums.length-1;
	while(left<=right){//加等号是因为当两个数指到同一个位置时，这个位置又刚好是要找的数
		int mid=left+(right-left)/2;//避免溢出，两边取闭区间
		if(nums[mid]==x)//这里找到就为止
			return mid;
		else if(nums[mid]<x)//这是卡着left不让它动
			left=mid+1;
		else                //尽量移动right
			right=mid-1;
	}
	return -1;
}
}

