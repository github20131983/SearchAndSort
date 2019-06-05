package recursionAndIteration;

import java.util.Scanner;

public class HanoiTower {
	/*汉诺塔从initNeedle借助tempNeedle移到endNeedle,n为盘片数目
	 * 
	 */
	public void hanoi(int n,String initNeedle,String tempNeedle,String endNeedle){
		if(n==1)
			System.out.println("move "+initNeedle+" to "+endNeedle);
		else {
			hanoi(n-1,initNeedle,endNeedle,tempNeedle);
			System.out.println("move "+initNeedle+" to "+endNeedle);
			hanoi(n-1,tempNeedle,initNeedle,endNeedle);
		}
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=in.nextInt();
		in.close();
		HanoiTower ht=new HanoiTower();
		System.out.println("the solution for n="+n);
		ht.hanoi(n, "A", "B", "C");
		
	}
}
