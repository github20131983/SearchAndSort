package topK;

public class TopKMin3 {
	public static int partion(int[] nums,int left,int right){
		int temp=nums[left];
		while(left<right){
		while(left<right&&nums[right]>=temp)right--;
		  nums[left]=nums[right];
		while(left<right&&nums[left]<temp)left++;
		  nums[right]=nums[left];
		}
		nums[left]=temp;
		return left;
	}
	public static int kthMin3(int[] nums,int left,int right,int k){
		int pivot=partion(nums, left, right);
		if(pivot==k-1)return nums[pivot];
		else if(pivot>k-1)
			return kthMin3(nums, left, pivot-1, k);
		else
			return kthMin3(nums, pivot+1, right, k);
	}

	public static int kthMin3(int[] nums,int k){
		return kthMin3(nums, 0, nums.length-1, k);
	}
	public static void main(String[] args){
		int[] test=new int[]{1,3,5,7,9,2,4,6,8,0};
		//将这个元素与原数组比较，自然可以找到前k个
		System.out.println(kthMin3(test, 3));
	}
}
