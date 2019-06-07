package dynamic;

//信封错排
public class LetterAndEnvelope {
	public int wrongNums(int N){
		if(N<2)return 0;
		int[] dp=new int[N+1];
		dp[1]=0;
		dp[2]=1;
		for(int i=3;i<=N;i++)
			dp[i]=(i-1)*dp[i-1]+(i-1)*dp[i-2];
		return dp[N];
	}
	public static void main(String[] args){
		LetterAndEnvelope lav=new LetterAndEnvelope();
		System.out.print(lav.wrongNums(4));
	}
}
