package sort;

import util.SortUtil;

public class HeapSort {
	SortUtil su=new SortUtil();
	//堆排序
	public void adjustHeap(int nums[],int i,int length){
		int temp=nums[i];
		for(int k=2*i+1;k<length;k=k*2+1){
			if(k+1<length&&nums[k]<nums[k+1])
				k++;
			if(nums[k]>temp){
				nums[i]=nums[k];
				i=k;
			}else {
				break;
			}
		}
		nums[i]=temp;
	}
	public int[] heapSort(int nums[]){
		for(int i=nums.length/2-1;i>=0;i--)
			adjustHeap(nums, i, nums.length);
		for(int j=nums.length-1;j>0;j--){
			su.swap(nums, 0, j);
			adjustHeap(nums, 0, j);
		}
		return nums;	
	}
}
