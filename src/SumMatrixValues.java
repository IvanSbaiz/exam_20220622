
/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

  public static void main(String[] args) {

    int[][] multiArr = {{23, 43, 2, 51}, {12, 32, 11, 56}, {44, 62, 33, 4}, {21, 66, 49, 3}};

    int sum = sumMultiArr(multiArr);

    System.out.println("MultiArray sum: " + sum);


  }

  private static int sumMultiArr(int[][] multiArr) {

    int sum = 0;

    for(int[] i : multiArr) {
      for(int j : i) {
        sum = sum + j;
      }
    }
    return sum;
  }

}