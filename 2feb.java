class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int peak = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[ (i+1) % n ]){
                peak++;
            }
        }
        return peak <= 1;


        /*
        for(int r = 0; r < nums.length; r++){
            int idx = 0;
            int[] sorted = new int[nums.length];
            for(int i = r; i < nums.length; i++){
                sorted[idx] = nums[i];
                idx++;
            }
            for(int i = 0; i < r; i++){
                sorted[idx] = nums[i];
                idx++;
            }
            boolean issorted = true;
            for(int i =0; i < sorted.length-1; i++){
                if(sorted[i] > sorted[i+1]){
                    issorted = false;
                    break;
                }
            }
            if(issorted) return true;
        }
        return false;
        */
    }
}