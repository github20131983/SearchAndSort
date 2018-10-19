package experiment;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import sort.BubbleSort;
import sort.BucketSort;
import sort.CountSort;
import sort.HeapSort;
import sort.InsertSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.RadixSort;
import sort.SelectSort;
import sort.ShellSort;
import util.InputAndOutputRedirect;

//各种排序性能测试
public class test {
	public static void main(String[] args) throws IOException{
		//从文件读出数字并且排序，计时
		Scanner scanner=InputAndOutputRedirect.fopenIn("file/input.txt");
		final int MAX=100000,MIN=1;
		int[] sort=new int[MAX];		
		int j=0;
		while(scanner.hasNext())
			sort[j++]=scanner.nextInt();
		InputAndOutputRedirect.close();
		
		long startTime = System.currentTimeMillis();    //获取开始时间
		BubbleSort bs=new BubbleSort();
		bs.bubbleSort(Arrays.copyOf(sort, sort.length));
		long endTime = System.currentTimeMillis();    //获取结束时间 
		System.out.println("冒泡排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    
		bs.improvedBubbleSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis(); 
		System.out.println("改进的冒泡排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		BucketSort bSort=new BucketSort();
		bSort.bucketSort(Arrays.copyOf(sort, sort.length), MAX,MIN);
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("桶排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		CountSort cs=new CountSort();
		cs.countSort(Arrays.copyOf(sort, sort.length), MAX, MIN);
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("计数排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		HeapSort hs=new HeapSort();
		hs.heapSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("堆排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		InsertSort is=new InsertSort();
		is.insertSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("插入排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		is.improvedInsertSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("改进的插入排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		MergeSort ms=new MergeSort();
		ms.mergeSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("归并排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		QuickSort qs=new QuickSort();
		qs.quickSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("快速排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		RadixSort rs=new RadixSort();
		rs.radixSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("基数排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		SelectSort ss=new SelectSort();
		ss.selectSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("选择排序运行时间："+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();    //获取开始时间
		ShellSort shs=new ShellSort();
		shs.shellSort(Arrays.copyOf(sort, sort.length));
		endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("希尔排序运行时间："+(endTime - startTime)+"ms");
	}
}
