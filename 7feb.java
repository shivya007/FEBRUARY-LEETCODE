class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        
        HashMap<Integer, Integer> colormap = new HashMap<>(); // color -> count
        HashMap<Integer, Integer> ballmap = new HashMap<>(); // ball -> color
        
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            
            if (ballmap.containsKey(ball)) { // already colored ball
                int prevcolor = ballmap.get(ball);
                colormap.put(prevcolor, colormap.get(prevcolor) - 1);
                
                if (colormap.get(prevcolor) == 0) {
                    colormap.remove(prevcolor);
                }
            }
            
            ballmap.put(ball, color);
            colormap.put(color, colormap.getOrDefault(color, 0) + 1);
            
            result[i] = colormap.size();
        }
        
        return result;
    }
}