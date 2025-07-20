import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> set = new HashMap<>();
        for (int num : nums) {
        set.put(num,false);
        }
        int longest = 0;

        for (int num : nums) {
            int length =1;
            int nex =num+1;
            while(set.containsKey(nex)&&set.get(nex) == false){
                length++;
                set.put(nex,true);
                nex++;
            }
            int pre =num-1;
            while(set.containsKey(pre) && !set.get(pre)){
                length++;
                set.put(pre,true);
                pre--;
            }
           
                longest = Math.max(longest, length);
            }
        

        return longest;
    }
}
