public class MatrixSpiralTraverse {
    public void matrixTraverse(int[][] matrix){
        int i=0, k=0 ,l=0;
        int m = matrix.length, n=matrix[0].length;
        int last_row=m-1, last_col=n-1;
        while(k<=last_row && l<=last_col){
            for(i=l;i<=last_col;i++)
                System.out.print(matrix[k][i] + " ");
            k++;
            for(i=k;i<=last_row;i++)
                System.out.print(matrix[i][last_col] + " ");
            last_col--;
            if(k<=last_row) {
                for (i = last_col; i >= l; i--)
                    System.out.print(matrix[last_row][i] + " ");
            }
            last_row--;
            if(l<=last_col) {
                for (i = last_row; i >= k; i--)
                    System.out.print(matrix[i][l] + " ");
            }
            l++;
        }
    }

    public static void main(String[] args) {
        MatrixSpiralTraverse matrixSpiralTraverse = new MatrixSpiralTraverse();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixSpiralTraverse.matrixTraverse(matrix);
    }
}
