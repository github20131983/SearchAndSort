package dynamic;
//数组中等差递增子区间的个数
public class ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] A){
		int cur=0,sum=0;
		for(int i=2;i<A.length;i++)
			if(A[i]-A[i-1]==A[i-1]-A[i-2]){
				cur++;
				sum+=cur;
			}else
				cur=0;
		return sum;
	}
}
