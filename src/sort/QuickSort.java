package sort;

public class QuickSort {
	//快速排序
	public int partition(int nums[],int low,int high){
		int temp=nums[low];
		while(low<high){
			while(low<high&&nums[high]>=temp)high--;
			nums[low]=nums[high];
			while(low<high&&nums[low]<=temp)low++;
			nums[high]=nums[low];
		}
		nums[low]=temp;
		return low;
	}

	public void quickSort(int nums[],int low,int high){
		if(low<high){
			int pivoloc=partition(nums, low, high);
			quickSort(nums, low, pivoloc-1);
			quickSort(nums, pivoloc+1, high);
		}
	}

	public int[] quickSort(int nums[]){
		quickSort(nums,0,nums.length-1);
		return nums;
	}
}
