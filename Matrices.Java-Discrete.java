public class Matrices {
    public static void main (String[] args){
        int matrixOne [][] = {{1, 0, 0, 1}, {0, 1, 0, 1}, {0, 0, 1, 0}, {1, 1, 1, 0}};
        int matrixTwo [][] = {{0, 1, 1, 1}, {1, 1, 0, 1}, {0, 1, 0, 1}, {1, 0, 1, 0}};

       // Call the multiplication result function.
        int resultMultiplication [][] = matrixMultiplyResult(matrixOne, matrixTwo);

        // Show result on screen.
         System.out.println("The result of the two Matrices Multiplication is: ");
         int sumValues = 0;
        System.out.println("\tv1\tv2\tv3\tv4");
         for (int i = 0; i < resultMultiplication.length; i++)

         {
             System.out.print("v" + (i+1) + "\t");
          for (int j = 0; j < resultMultiplication[0].length; j++) {
             System.out.print(resultMultiplication[i][j] + "\t");
             sumValues += resultMultiplication[i][j];
         }
         System.out.println();
         }
        System.out.println("Total number of unique connections: " + sumValues);
    }
    public static int [][] matrixMultiplyResult (int matrixOne [][], int matrixTwo [][]){
        int rows = matrixOne.length;
        int cols = matrixTwo[0].length;

        int vectorLength = matrixOne[0].length;
        int resultMultiplication [][] = new int [rows][cols];


        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                resultMultiplication[i][j]=0;
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                for (int s = 0; s < vectorLength; s++) {
                    resultMultiplication[i][j] += matrixOne[i][s] * matrixTwo[s][j];

                }
            }
            }
        return resultMultiplication;

    }


}
