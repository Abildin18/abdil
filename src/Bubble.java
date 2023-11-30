public class Bubble {
    public static void main(String[] args) {
        int[][] arrayNums = { {9,5,4,8}, {0,2,7,3}, {6,1,10,11}};
      //  for(int i =0;i< arrayNums.length-1;i++);//            for (int j = 0; j < arrayNums.length-1; j++) {
//                for (int k = 0; k < arrayNums.length; k++) {
//                    for (int l = 0; l < arrayNums.length ; l++) {
//                        if(arrayNums[i][j]>arrayNums[k][l]){
//                            arrayNums[i][j]=arrayNums[i][j]+arrayNums[k][l];
//                            arrayNums[k][l]=arrayNums[i][j]-arrayNums[k][l];
//                            arrayNums[i][j]=arrayNums[i][j]-arrayNums[k][l];
//
//                        }
//                    }
//                }
//            }
//            System.out.println(arrayNums);

        for (int i = 0; i < arrayNums.length; i++) {
            for (int j = 0; j < arrayNums[i].length; j++) {
                System.out.print(arrayNums[i][j] + " ");
            }
            System.out.println();


        }

    }
}