public class Diagonal {
    public void diagonalTraverse(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int k, i,j;
        for(k=0;k<=m-1;k++){
            i=k;
            j=0;
            while(i>=0){
                System.out.print(matrix[i][j] + " ");
                i -=1;
                j +=1;
            }
        }
        for(k=1;k<=n-1;k++) {
            i = m - 1;
            j = k;
            while (j <= n - 1) {
                System.out.print(matrix[i][j] + " ");
                i -= 1;
                j += 1;
            }
        }
    }

    public static void main(String[] args) {
        Diagonal diagonal = new Diagonal();
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,0},{11,12,13,14,15},{16,17,18,19,20}};
        diagonal.diagonalTraverse(matrix);
    }
}
