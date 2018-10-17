package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	//桶排序，适用于差距大，但是分布均匀的数字
	public int[] bucketSort(int nums[],int max,int min){
		int bucketNum=(max-min)/nums.length+1;
		List<List<Integer>> bucketArr = new ArrayList<>(bucketNum);
	    for(int i = 0; i < bucketNum; i++){
	        bucketArr.add(new ArrayList<Integer>());
	    }

	    for(int i = 0; i < nums.length; i++){
	        int num = (nums[i] - min) / (nums.length);
	        bucketArr.get(num).add(nums[i]);
	    }
	    
	    int index=0;
	    for(int i = 0; i < bucketArr.size(); i++){
	        Collections.sort(bucketArr.get(i));
	        for(int j = 0; j < bucketArr.get(i).size(); j++)
	        	nums[index++]=bucketArr.get(i).get(j);
	    }
		return nums;	
	}
}
