package dynamic;

public class Pack0_1 {
   public int pack(int[] weight,int[] value,int count,int capacity){
	   int[][] dp=new int[count+1][capacity+1];
	   for(int i=1;i<=count;i++)
		   for(int j=1;j<=capacity;j++){
			   if(j>=weight[i-1])
				   dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
			   else 
				   dp[i][j]=dp[i-1][j];
		   }
	   for(int[] i:dp){
		   for(int j:i)
			   System.out.print(j+" ");
		   System.out.println();
	   }
	   return dp[count][capacity];
   }
   public int pack2(int[] weight,int[] value,int count,int capacity){
	   int[] dp=new int[capacity+1];
	   for(int i=1;i<=count;i++){
		   for(int j=capacity;j>0;j--){
			   if(j>=weight[i-1])
				   dp[j]=Math.max(dp[j], dp[j-weight[i-1]]+value[i-1]);
		   }	
		   for(int d:dp)
			   System.out.print(d+" ");
		   System.out.println();
	   }
	   return dp[capacity];
   }
   public static void main(String[] args){
	   Pack0_1 p=new Pack0_1();
	   int[] w=new int[]{2,3,4,5};
	   int[] v=new int[]{3,4,5,6};
	   System.out.println(p.pack(w, v, 4, 8));
	   System.out.println(p.pack2(w, v, 4, 8));
   }
}
