class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        List<Integer> result = new ArrayList<>();

        // Check every 3-digit even number
        for (int num = 100; num <= 998; num += 2) { // step by 2 for even numbers
            int x = num;
            int[] need = new int[10];

            need[x % 10]++; x /= 10;
            need[x % 10]++; x /= 10;
            need[x % 10]++;

            boolean ok = true;

            for (int d = 0; d < 10; d++) {
                if (need[d] > freq[d]) {
                    ok = false;
                    break;
                }
            }

            if (ok) result.add(num);
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }
}
