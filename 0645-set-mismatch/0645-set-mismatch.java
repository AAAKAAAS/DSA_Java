class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        int duplicate = -1;

        for (int num : nums) {
            if (set.contains(num))
                duplicate = num;
            set.add(num);
        }

        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}