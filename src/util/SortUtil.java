package util;

public class SortUtil {
	//交换数组中的两个数
	public void swap(int[] nums,int i,int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

	//数组打印
	public void print(int[] nums){
		for(int num:nums)
			System.out.print(num+" ");
	}
	
	//数组打印，10个一行
	public void print10(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
			if((i+1)%10==0)
				System.out.println();
		}
	}

	//随机生成1到range范围内的count个数字，并且至少生成一个range，一个1
	public int[] randomNum(int count,int range){
		int[] num=new int[count];
		num[0]=1;num[1]=range;
		for(int i=2;i<count;i++)
			num[i]=(int)(Math.random()*range+1);
		return num;
	}
}
