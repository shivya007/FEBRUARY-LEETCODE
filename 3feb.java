class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int max = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] > nums[i]){
                inc++;
                dec = 1;
            }
            else if(nums[i+1] < nums[i]){
                dec++;
                inc = 1;
            }
            else{
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }
        return max;
        /*
        int res = Integer.MIN_VALUE;
        int n = nums.length;
        // first we find the max of strictly inc.
        for(int i =0; i < n-1; i++){
            int maxlen1 = 1;
            int prev = nums[i];
            for(int j = i+1; j < n; j++){
                if(prev < nums[j]){
                    maxlen1++;
                    prev = nums[j];
                }
                else{
                    break;
                }
            }
            res = Math.max(res, maxlen1);            
        }

        // then we find the max of strictly dec.
        for(int i =0; i < n-1; i++){
            int maxlen2 = 1;
            int prev = nums[i];
            for(int j = i+1; j < n; j++){
                if(prev > nums[j]){
                    maxlen2++;
                    prev = nums[j];
                }
                else{
                    break;
                }
            }
             res = Math.max(res, maxlen2);
        }
        if(res != Integer.MIN_VALUE) return res;
        return 1;
        */
    }
}