package dynamic;

public class HouseRobberII {
	public int rob(int[] nums) {
        int length=nums.length;
        if(length==0)return 0;
        if(length==1)return nums[0];
        if(length==2)return Math.max(nums[0], nums[1]);
        return Math.max(robHelper(nums, 0, length-2),robHelper(nums, 1, length-1));
    }
	public int robHelper(int[] nums,int begin,int end){
		int[] dp=new int[nums.length];
		dp[begin]=nums[begin];
		dp[begin+1]=Math.max(nums[begin],nums[begin+1]);
		for(int i=begin+2;i<=end;i++)
			dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
		return dp[end];
	}
}
