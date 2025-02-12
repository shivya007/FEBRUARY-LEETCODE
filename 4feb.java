class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int maxsum = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] > nums[i]){
                sum += nums[i+1];
            }
            else{
                maxsum = Math.max(maxsum, sum);
                sum = nums[i+1];
            }
        }
        maxsum = Math.max(maxsum, sum);
        return maxsum;
    }
}