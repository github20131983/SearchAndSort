package test;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

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
import util.SortUtil;

public class TestSort {
	SortUtil su=new SortUtil();
	int[] originNums=su.randomNum(20,30);
	
	@Ignore
	public void bubbleSortTest() {
		BubbleSort bs=new BubbleSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(bs.bubbleSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（冒泡排序）");
		su.print(bs.improvedBubbleSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（改进的冒泡排序）");
	}
	
	@Ignore
	public void selectSortTest() {
		SelectSort ss=new SelectSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(ss.selectSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（选择排序）");
	}
	
	@Ignore
	public void insertSortTest() {
		InsertSort is=new InsertSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(is.insertSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（插入排序）");
		su.print(is.improvedInsertSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（改进的插入排序）");
	}
	
	@Ignore
	public void shellSortTest() {
		ShellSort ss=new ShellSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(ss.shellSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（希尔排序）");
	}
	
	@Ignore
	public void mergeSortTest() {
		MergeSort ms=new MergeSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(ms.mergeSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（归并排序）");
	}
	
	@Ignore
	public void quickSortTest() {
		QuickSort qs=new QuickSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(qs.quickSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（快速排序）");
	}
	
	@Ignore
	public void heapSortTest() {
		HeapSort hs=new HeapSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(hs.heapSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（堆排序）");
	}
	
	@Ignore
	public void buckSortTest() {
		BucketSort bs=new BucketSort();
		int[] test={10,19,20,18,27,20,3,5,7,9,18,15,20,24,28,20,15,26,18,7};
		su.print(test);
		System.out.println("（原数组）");
		su.print(bs.bucketSort(Arrays.copyOf(test, test.length),28,3));
		System.out.println("（桶排序）");
	}
	
	@Ignore
	public void countSortTest() {
		CountSort cs=new CountSort();
		int[] test={10,19,20,18,27,20,3,5,7,9,18,15,20,24,28,20,15,26,18,7};
		su.print(test);
		System.out.println("（原数组）");
		su.print(cs.countSort(Arrays.copyOf(test, test.length),28,3));
		System.out.println("（计数排序）");
	}
	
	@Test
	public void radixSortTest() {
		RadixSort rs=new RadixSort();
		su.print(originNums);
		System.out.println("（原数组）");
		su.print(rs.radixSort(Arrays.copyOf(originNums, originNums.length)));
		System.out.println("（基数排序）");
	}
}
