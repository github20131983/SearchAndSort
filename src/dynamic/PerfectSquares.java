package dynamic;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
	public int minSquares(int n){
		List<Integer> list=squareList(n);
		int[] dp=new int[n+1];
		for(int i=1;i<=n;i++){
			int min=Integer.MAX_VALUE;
			for(int square:list){
				if(square>i)
					break;
				min=Math.min(min,dp[i-square]+1);
			}
			dp[i]=min;
		}
		return dp[n];	
	}
	public List<Integer> squareList(int n){
		List<Integer> squareList=new ArrayList<Integer>();
		for(int i=1;i*i<=n;i++)
			squareList.add(i*i);
		return squareList;
	}
	public static void main(String[] args){
		
	}
}
