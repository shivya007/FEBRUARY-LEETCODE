class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num :nums){
            pq.add((long)num);
        }
        int count = 0;

        while(!pq.isEmpty() && pq.peek() < k){
            long smallest = pq.remove();
            long smallest2 = pq.remove();
            pq.add((smallest * 2) + smallest2);
            count++;
        }
        return count;
    }
}