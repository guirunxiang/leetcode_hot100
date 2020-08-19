/**
 * 22. 旋转图像
 */

//先上下逆置,再延主对角线逆置
class Solution22 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[n-j-1][i];
                matrix[n-j-1][i] = tmp;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}