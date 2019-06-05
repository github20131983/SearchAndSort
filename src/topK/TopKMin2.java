package topK;

public class TopKMin2 {
	//假设除了i位置，别的都满足大根堆的定义，现在调节大根堆
	public static void adjust(int[] nums,int i,int length){
		int temp=nums[i];
		for(int k=2*i+1;k<length;k=k*2+1){
			if(k+1<length&&nums[k]<nums[k+1])
				k++;
			if(temp<nums[k]){
				nums[i]=nums[k];
				i=k;
			}else
				break;		
		}
		nums[i]=temp;
	}
	
	public static void topKMin2(int[] nums,int k){
		for(int i=k/2-1;i>=0;i--)
			adjust(nums, i, k);//先调节一个大根堆
		for(int i=k;i<nums.length;i++){//新来的比根小就替换
			if(nums[i]<nums[0]){
				nums[0]=nums[i];
				adjust(nums, 0, k);
			}	
		}
	}
	
	//只要来的比根上的小，就换掉根，然后调节
	public static int kthMin2(int[] nums,int k){
		for(int i=k/2-1;i>=0;i--)
			adjust(nums, i, k);//先调节一个大根堆
		for(int i=k;i<nums.length;i++){//新来的比根小就替换
			if(nums[i]<nums[0]){
				nums[0]=nums[i];
				adjust(nums, 0, k);
			}	
		}
		return nums[0];
	}
	
	public static void main(String[] args){
		int[] test=new int[]{1,3,5,7,9,2,4,6,8,0};		
		System.out.println(kthMin2(test, 3));
		for(int i=0;i<3;i++)
			System.out.println(test[i]);
	}
}
