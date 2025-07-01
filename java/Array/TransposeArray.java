public class TransposeArray {
        public static void main(String[] args) {
            int[][] array = {{1, 2, 3}, {4, 5, 6}};
            System.out.println(array.length);
            int[][] transpose = new int[array[0].length][array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.printf("Transpose of [%d][%d] is:  [%d][%d] \n",j,i,i,j);
                    transpose[j][i] = array[i][j];
                }
            }
            for (int[] row : transpose) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    }




