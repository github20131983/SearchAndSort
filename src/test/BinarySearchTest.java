package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import binarySearch.BinarySearch1;
import binarySearch.BinarySearch2;
import binarySearch.BinarySearch3;
import binarySearch.BinarySearch4;
import binarySearch.BinarySearch5;

public class BinarySearchTest {	
	@Ignore
	public void test1() {
		int[] case1=new int[]{1,2,3,4,5,6,8,9,10,13,17,18};
		int[] case2=new int[]{1,2};
		int[] case3=new int[]{1};
		int[] case4=new int[]{};
		BinarySearch1 bs1=new BinarySearch1();
		assertEquals(4, bs1.binarySearch(case1,5));
		assertEquals(0, bs1.binarySearch(case2,1));
		assertEquals(1, bs1.binarySearch(case2,2));
		assertEquals(0, bs1.binarySearch(case3,1));
		assertEquals(-1, bs1.binarySearch(case4,1));
	}

	@Ignore
	public void test2() {
		int[] case1=new int[]{1,2,3,4,5,6,8,9,10,13,17,18};
		int[] case2=new int[]{1,1,1,2,3,4,4,4};
		int[] case3=new int[]{1};
		int[] case4=new int[]{};
		BinarySearch2 bs2=new BinarySearch2();
		assertEquals(4, bs2.binarySearch(case1,5));
		assertEquals(0, bs2.binarySearch(case2,1));
		assertEquals(5, bs2.binarySearch(case2,4));
		assertEquals(0, bs2.binarySearch(case3,1));
		assertEquals(-1, bs2.binarySearch(case3,2));
		assertEquals(-1, bs2.binarySearch(case4,1));
	}
	
	@Ignore
	public void test3() {
		int[] case1=new int[]{1,2,3,4,5,6,8,9,10,13,17,18};
		int[] case2=new int[]{1,1,1,2,3,4,4,4};
		int[] case3=new int[]{1};
		int[] case4=new int[]{};
		BinarySearch3 bs3=new BinarySearch3();
		assertEquals(4, bs3.binarySearch(case1,5));
		assertEquals(2, bs3.binarySearch(case2,1));
		assertEquals(7, bs3.binarySearch(case2,4));
		assertEquals(0, bs3.binarySearch(case3,1));
		assertEquals(-1, bs3.binarySearch(case3,2));
		assertEquals(-1, bs3.binarySearch(case4,1));
	}
	
	@Ignore
	public void test4() {
		int[] case1=new int[]{1,2,3,4,5,6,8,9,10,13,17,18};
		int[] case2=new int[]{1,1,1,2,3,4,4,4};
		int[] case3=new int[]{1};
		int[] case4=new int[]{};
		BinarySearch4 bs4=new BinarySearch4();
		assertEquals(5, bs4.binarySearch(case1,5));
		assertEquals(3, bs4.binarySearch(case2,1));
		assertEquals(-1, bs4.binarySearch(case2,4));
		assertEquals(-1, bs4.binarySearch(case3,1));
		assertEquals(0, bs4.binarySearch(case3,0));
		assertEquals(-1, bs4.binarySearch(case4,1));
	}
	
	@Test
	public void test5() {
		int[] case1=new int[]{1,2,3,4,5,6,8,9,10,13,17,18};
		int[] case2=new int[]{1,1,1,2,3,4,4,4};
		int[] case3=new int[]{1};
		int[] case4=new int[]{};
		BinarySearch5 bs5=new BinarySearch5();
		assertEquals(3, bs5.binarySearch(case1,5));
		assertEquals(-1, bs5.binarySearch(case2,1));
		assertEquals(4, bs5.binarySearch(case2,4));
		assertEquals(-1, bs5.binarySearch(case3,1));
		assertEquals(0, bs5.binarySearch(case3,2));
		assertEquals(-1, bs5.binarySearch(case4,1));
	}
}
