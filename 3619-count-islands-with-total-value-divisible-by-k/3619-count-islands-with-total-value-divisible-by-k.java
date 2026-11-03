class Solution {
    public int countIslands(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] > 0) {

                    long sum = 0;

                    q.offer(new int[]{i, j});

                    sum += grid[i][j];
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {

                        int[] curr = q.poll();

                        int x = curr[0];
                        int y = curr[1];

                        for (int d = 0; d < 4; d++) {

                            int nx = x + dr[d];
                            int ny = y + dc[d];

                            if (nx < 0 || ny < 0 ||
                                nx >= m || ny >= n ||
                                grid[nx][ny] == 0) {
                                continue;
                            }

                            sum += grid[nx][ny];

                            grid[nx][ny] = 0;

                            q.offer(new int[]{nx, ny});
                        }
                    }

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}