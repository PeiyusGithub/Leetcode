class Solution {
    public int[][] imageSmoother(int[][] M) {
        int [][] result = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++){
                 int sum = 0, count = 0;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum = sum + M[i - 1][j - 1];
                    count++;
                }
                if (i - 1 >= 0) {
                    sum = sum + M[i - 1][j];
                    count++;
                }
                if (i - 1 >= 0 && j + 1 < M[i].length) {
                    sum = sum + M[i - 1][j + 1];
                    count++;
                }
                if (j - 1 >= 0) {
                    sum = sum + M[i][j - 1];
                    count++;
                }
                if ( j + 1 < M[i].length) {
                    sum = sum + M[i][j + 1];
                    count++;
                }
                if (i + 1 < M.length && j - 1 >= 0) {
                    sum = sum + M[i + 1][j - 1];
                    count++;
                }
                if (i + 1 < M.length) {
                    sum = sum + M[i + 1][j];
                    count++;
                }
                if (i + 1 < M.length && j + 1 < M[i].length) {
                    sum = sum + M[i + 1][j + 1];
                    count++;
                }
                sum = sum + M[i][j];
                count++;
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}