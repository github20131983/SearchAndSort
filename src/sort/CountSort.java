package sort;

public class CountSort {
	//计数排序,适用于已经知道最大值与最小值并且二者差距不大，比如班级成绩，人们年龄等
	public int[] countSort(int nums[],int max,int min){
		int[] count=new int[max-min+1];
		for(int i=0;i<nums.length;i++){
			count[nums[i]-min]++;
		}
		int index=0;
		for(int i=0;i<count.length;i++)
			while(count[i]-->0)
				nums[index++]=i+min;
		return nums;	
	}
}
