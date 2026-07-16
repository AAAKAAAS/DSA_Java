class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String sample = "123456789";
        
        // Determine the minimum and maximum possible digit lengths
        int minLen = Integer.toString(low).length();
        int maxLen = Integer.toString(high).length();
        
        // Loop through all possible lengths
        for (int len = minLen; len <= maxLen; len++) {
            // Slide a window of size 'len' across the sample string
            for (int start = 0; start <= 9 - len; start++) {
                String sub = sample.substring(start, start + len);
                int val = Integer.parseInt(sub);
                
                // Add to result if it fits within the boundaries
                if (val >= low && val <= high) {
                    result.add(val);
                }
            }
        }
        
        return result;
    }
}