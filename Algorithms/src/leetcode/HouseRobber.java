/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
 * money you can rob tonight without alerting the police.
 */
public class HouseRobber {

    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;

        int[] robmoney= new int[n];
        robmoney[0] = nums[0];

        for(int i=1;i< n;i++){
            if(i==1){
                robmoney[i] = Math.max(nums[i-1],nums[i]);
            }
            else{
                robmoney[i]= Math.max(robmoney[i-1],robmoney[i-2]+nums[i]);
            }
        }

        return robmoney[n-1];
    }

    public static void main(String[] args) {
         int[] nums= {1,2,3,4};
         System.out.println("The optimal solution: " +rob(nums));
    }
}
