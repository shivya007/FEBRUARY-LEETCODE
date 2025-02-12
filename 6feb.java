class Solution {
    public int tupleSameProduct(int[] nums) {
        int tuple = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer freqvalue = entry.getValue();

            tuple += ( freqvalue * ( freqvalue - 1 ) ) / 2;
        }
        return tuple * 8;





        /*
        int tuple = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                HashSet<Integer> set = new HashSet<>();
                int prod1 = nums[i] * nums[j];
                for(int k = i+1; k < j; k++){
                    if(prod1 % nums[k] == 0){
                        int dValue = prod1 / nums[k];
                        if(set.contains(dValue)){
                            tuple++;
                        }
                        set.add(nums[k]);
                    }
                }
            }
        }
        return tuple * 8;
*/






        /*int tuple = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                for(int k = i+1; k < j; k++){
                    for(int l = j-1; l > k; l--){
                        int prod1 = nums[i] * nums[j];
                        int prod2 = nums[k] * nums[l];
                        if(prod1 == prod2){
                            tuple++;
                        }
                    }
                }
            }
        }
        return tuple * 8;
*/



       /* int tuple = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = 0; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        if(i != k && i != l && j != k && j != l){
                            int prod1 = nums[i] * nums[j];
                            int prod2 = nums[k] * nums[l];
                            if(prod1 == prod2){
                                tuple++;
                            }
                        }
                    }
                }
            }
        }
        int total = tuple / 2;
        return total * 8;
        */
    }
}