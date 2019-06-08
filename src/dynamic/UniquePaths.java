package dynamic;

import java.util.Arrays;
//矩阵的总路径数，也可以用排列组合的方式解决，比如m=3,n=7,总共走3+7-2步，向下2步，所以C(8,2)
public class UniquePaths{
	public int numsOfPaths(int m,int n){
		int[] dp=new int[n];
		Arrays.fill(dp, 1);
		for(int i=1;i<m;i++)
			for(int j=1;j<n;j++)
				dp[j]+=dp[j-1];
		return dp[n-1];
	}
	public static void main(String[] args){
		UniquePaths up=new UniquePaths();
		System.out.println(up.numsOfPaths(3, 7));
	}
}
