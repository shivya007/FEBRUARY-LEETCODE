class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long count = 0;
        int diffarray[] = new inta[n];
        for(int i =0; i < n; i++){
           diffarray[i] = nums[i] - i;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < n; j++){
            int totalElementsBeforej = j;
            if(map.containsKey(diffarray[j])){
                count += totalElementsBeforej - map.get(diffarray[j]);
                map.put(diffarray[j], map.getOrDefault(diffarray[j], 0) + 1);
            }
            else{
                count += totalElementsBeforej;
                map.put(diffarray[j], 1);
            }
        }
        return count;



        /*
        long count = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int idxdiff = j - i;
                int valdiff = nums[j] - nums[i];
                if(idxdiff != valdiff) count++;
            }
        }
        return count;*/
    }
}