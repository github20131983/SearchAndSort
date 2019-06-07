package dynamic;

public class CowProduction {
	public int cowNumAfterNYears(int N){
		if(N<4)return N;
		int[] dp=new int[N+1];
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		for(int i=4;i<=N;i++)
			dp[i]=dp[i-1]+dp[i-3];
		return dp[N];
	}
	public static void main(String[] args){
		CowProduction cpd=new CowProduction();
		System.out.println(cpd.cowNumAfterNYears(4));
	}
}
