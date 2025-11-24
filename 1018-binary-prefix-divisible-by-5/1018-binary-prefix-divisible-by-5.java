import java.util.*;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>(nums.length);
        int val = 0; // current prefix value modulo 5
        for (int bit : nums) {
            val = ((val << 1) + bit) % 5; // (val*2 + bit) % 5
            res.add(val == 0);
        }
        return res;
    }
}
