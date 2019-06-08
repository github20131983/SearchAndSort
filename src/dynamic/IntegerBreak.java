package dynamic;
//将整数分成几个数的和使得其成绩最大
public class IntegerBreak {
	public int maxMultiBreak(int n){
		int[] dp=new int[n+1];
		dp[1]=1;
		for(int i=2;i<=n;i++)
			for(int j=1;j<=i-1;j++)
				dp[i]=Math.max(dp[i],Math.max(j*(i-j), j*dp[i-j]));
		return dp[n];
	}
	public static void main(String[] args){
		IntegerBreak ib=new IntegerBreak();
		System.out.println(ib.maxMultiBreak(10));
	}
}
