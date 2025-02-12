class Solution {
    public int numtoSum(int val){
        int sum = 0;
        int num = val;
        while(num > 0){
            int lastdigit = num % 10;
            sum += lastdigit;
            num = num / 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int[] sums = new int[82];
        for(int i =0; i < n; i++){
            int sum = numtoSum(nums[i]);

            if( sums[sum] > 0 ){
                ans = Math.max(ans, nums[i] + sums[sum]);
            }
            sums[sum] = Math.max(nums[i], sums[sum]);
        }
        return ans;

        /*
        int n = nums.length;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < n; i++){
            int sum = numtoSum(nums[i]);

            if(map.containsKey(sum)){
                ans = Math.max(ans, nums[i] + map.get(sum));
            }
            map.put(sum, Math.max(nums[i], map.getOrDefault(sum, 0)));
        }
        return ans;
        */






        /*
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i =0; i < n-1; i++){
            int num = nums[i];
            int sum = numtoSum(num);
            for(int j = i+1; j < n; j++){
                int num2 = nums[j];
                if(numtoSum(num2) == sum){
                    max = Math.max(max, num + num2);
                }
            }
        }
        if(max ==  Integer.MIN_VALUE ) return -1;
        return max;
        */
    }
}