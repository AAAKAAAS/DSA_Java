

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int pairCount = 0;
        
        // Map to store row representation and its frequency
        Map<String, Integer> rowMap = new HashMap<>();
        
        // Step 1: Serialize each row and count frequencies
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String rowKey = sb.toString();
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }
        
        // Step 2: Serialize each column and check against the map
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colKey = sb.toString();
            
            // If the column match exists in rows, add the frequency of that row
            if (rowMap.containsKey(colKey)) {
                pairCount += rowMap.get(colKey);
            }
        }
        
        return pairCount;
    }
}
