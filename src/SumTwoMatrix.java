
/*
  Given two matrix of ints prints on standard output the sum of both matrix
  A: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

  public static void main(String[] args) {

    int[][] arrMatrixOne = {{4, 8, 1, 40}, {9, 11, 23, 6}, {13, 34, 21, 81}};
    int[][] arrMatrixTwo = {{6, 3, 64, 22}, {32, 12, 55, 12}, {19, 24, 77, 31}};
    int[][] arrMatrixThree = new int [3][4];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        arrMatrixThree [i][j] = arrMatrixOne [i][j] + arrMatrixTwo[i][j];
      }

    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {

        System.out.print(arrMatrixThree[i][j] + "," + " ");
      }

      System.out.println();
    }


  }

}