class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] new_matrx = new int[col][row];

        for(int i = 0 ; i < row ;i++){
            for(int j = 0 ; j < col ; j++){
                new_matrx[j][i] = matrix[i][j];
            }
        }
        return new_matrx;
    }

}
