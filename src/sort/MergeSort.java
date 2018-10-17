package sort;

public class MergeSort {
	//归并排序
	public void merge(int nums[],int left,int mid,int right,int temp[]){
		int i = left;
	    int j = mid+1;
	    int t = 0;
	    while (i<=mid && j<=right){
	        if(nums[i]<=nums[j]){
	            temp[t++] = nums[i++];
	        }else {
	            temp[t++] = nums[j++];
	        }
	    }
	    while(i<=mid){
	        temp[t++] = nums[i++];
	    }
	    while(j<=right){
	        temp[t++] = nums[j++];
	    }
	    t = 0;
	    while(left <= right){
	       nums[left++] = temp[t++];
	    }
	}

	public void mergeSort(int nums[],int left,int right,int []temp){
		 if(left<right){
	         int mid = (left+right)/2;
	         mergeSort(nums,left,mid,temp);
	         mergeSort(nums,mid+1,right,temp);
	         merge(nums,left,mid,right,temp);
	     }	
	}

	public int[] mergeSort(int nums[]){
		int []temp = new int[nums.length];
	    mergeSort(nums,0,nums.length-1,temp);
	    return  nums;
	}
}
