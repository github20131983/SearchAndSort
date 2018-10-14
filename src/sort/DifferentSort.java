package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//各种排序算法
public class DifferentSort {
//冒泡排序,它的外循环是排序的轮数，内循环是每一轮的相邻数据的两两比较
//时间复杂度是o(n^2),空间复杂度是O(1)
public int[] BubbleSort(int[] nums){
	for(int i=0;i<nums.length-1;i++)
		for(int j=0;j<nums.length-i-1;j++)
			if(nums[j]>nums[j+1])//稳定
			    swap(nums,j,j+1);
	return nums;	
}

//改进的冒泡排序算法，改进之处在于如果某一轮没有发生过交换，那么就是后边的都有序了，就不需要再排了
//时间复杂度是o(n^2),空间复杂度是O(1)
public int[] improvedBubbleSort(int[] nums){
	for(int i=0;i<nums.length-1;i++){
		boolean flag=true;
		for(int j=0;j<nums.length-i-1;j++)
			if(nums[j]>nums[j+1]){//稳定
			    swap(nums,j,j+1);
			    flag=false;
			}
		if(flag)
		   break;
	}
	return nums;	
}

//选择排序算法，它的外循环是轮数，也可以说是一次从前到后为每一位选择值，内循环是选取这个值的过程
//时间复杂度是o(n^2),空间复杂度是O(1)
public int[] selectSort(int[] nums){
    for(int i=0;i<nums.length-1;i++){
    	int min=i;
    	for(int j=i+1;j<nums.length;j++)
    		if(nums[j]<nums[min])//不稳定，其不稳定如5 8 5 2 9
    			min=j;
    	if(min!=i)
    	  swap(nums, i, min);
    }
	return nums;	
}

//插入排序算法，外层循环仍然是排序的轮数，内层循环是插入的过程
//时间复杂度是o(n^2),空间复杂度是O(1)
public int[] insertSort(int[] nums){
	for(int i=1;i<nums.length;i++){
		int j=i;
		while(j>0&&nums[j]<nums[j-1]){//稳定
			swap(nums, j, j-1);
			j--;
		}
	}		
	return nums;	
}

//改进的排序插入算法，在寻找插入位置的过程中使用二分查找
public int[] improvedInsertSort(int[] nums){
	for(int i=1;i<nums.length;i++){
		int temp=nums[i];
		int left=0,right=i-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]<=temp)
				left=mid+1;
			else 
				right=mid-1;
		}
		for(int j=i;j>right+1;j--)
			nums[j]=nums[j-1];
		nums[right+1]=temp;
	}	
	return nums;	
}

//希尔排序
public int[] shellSort(int nums[]){
	for(int gap=nums.length/2;gap>0;gap/=2){
		for(int i=gap;i<nums.length;i++){
			int j=i;
			while(j-gap>=0&&nums[j-gap]>nums[j]){
				swap(nums,j-gap,j);
				j-=gap;
			}
		}
	}
	return nums;	
}

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
public int[] HeapSort(int nums[]){
	for(int i=nums.length/2-1;i>=0;i--)
		adjustHeap(nums, i, nums.length);
	for(int j=nums.length-1;j>0;j--){
		swap(nums, 0, j);
		adjustHeap(nums, 0, j);
	}
	return nums;	
}

//基数排序
public void radixHelp(int[] a, int exp) {
    int[] output = new int[a.length];   
    int[] buckets = new int[10];

    for (int i = 0; i < a.length; i++)
        buckets[ (a[i]/exp)%10 ]++;

    for (int i = 1; i < 10; i++)
        buckets[i] += buckets[i - 1];

    for (int i = a.length - 1; i >= 0; i--) {
        output[buckets[ (a[i]/exp)%10 ] - 1] = a[i];
        buckets[ (a[i]/exp)%10 ]--;
    }

    for (int i = 0; i < a.length; i++)
        a[i] = output[i];
}
public int[] radixSort(int nums[]){
	int exp; 
	int max = nums[0]; 
	for(int i=0;i<nums.length;i++)
		max=Math.max(nums[i], max);
    for (exp = 1; max/exp > 0; exp *= 10)
    	radixHelp(nums, exp);
	return nums;
}
//------------------非比较排序-----------------------
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
//--------------------------------------------------


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

public int[] randomNum(int count,int range){
	int[] num=new int[count];
	for(int i=0;i<count;i++)
		num[i]=(int)(Math.random()*range+1);
	return num;
}

public static void main(String[] args){
	//int[] originNums={1,3,5,7,9,2,4,6,8,0,5,6,13,2,45,31};
	DifferentSort dSort=new DifferentSort();
	int[] originNums=dSort.randomNum(20,30);
	
	int[] bubbleNums=dSort.BubbleSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(bubbleNums);
    System.out.println("（冒泡排序）");
	
    int[] improvedBubbleNums=dSort.improvedBubbleSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(improvedBubbleNums);
    System.out.println("（改进的冒泡排序）");
    
    int[] selectNums=dSort.selectSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(selectNums);
    System.out.println("（选择排序）");
    
    int[] insertNums=dSort.insertSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(insertNums);
    System.out.println("（插入排序）");
    
    int[] improveInsertNums=dSort.improvedInsertSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(improveInsertNums);
    System.out.println("（改进的插入排序）");
    
    int[] shellNums=dSort.shellSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(shellNums);
    System.out.println("（希尔排序）");
    
    int[] mergeNums=dSort.mergeSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(mergeNums);
    System.out.println("（归并排序）");
    
    int[] quickNums=dSort.quickSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(quickNums);
    System.out.println("（快速排序）");
    
    int[] heapNums=dSort.HeapSort(Arrays.copyOf(originNums, originNums.length));
    dSort.print(heapNums);
    System.out.println("（堆排序）");
    
//    int[] countNums=dSort.countSort(Arrays.copyOf(originNums, originNums.length),45,0);
//    dSort.print(countNums);
//    System.out.println("（计数排序）");
//    
//    int[] bucketNums=dSort.bucketSort(Arrays.copyOf(originNums, originNums.length),45,0);
//    dSort.print(bucketNums);
//    System.out.println("（桶排序）");
    
    int[] radixNums=dSort.bucketSort(Arrays.copyOf(originNums, originNums.length),45,0);
    dSort.print(radixNums);
    System.out.println("（基数排序）");
    
    dSort.print(originNums);
    System.out.println("（原数组）");
}
}
