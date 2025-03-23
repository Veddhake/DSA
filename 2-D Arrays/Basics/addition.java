import java.util.*;

public class addition {

  public static void print(int [][]arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static int[][] add(int[][]arr1,int[][]arr2)
  {
    int[][] sum= new int[arr1.length][arr1[0].length];

    for(int i=0;i<arr1.length;i++)
    {
      for(int j=0;j<arr1[i].length;j++)
      {
        sum[i][j]=arr1[i][j]+arr2[i][j];
      }
    }

    return sum;
  }

  public static int[][] make2dArray()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of rows");

    int r = sc.nextInt();

    System.out.println("Enter number of columns");

    int c = sc.nextInt();

    int[][] arr= new int [r][c];

    System.out.println("Enter the elements");

    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    return arr;
  }

  public static void main(String[] args)
  {
    int[][]arr1= make2dArray();
    int[][]arr2=make2dArray();
    int[][]sum=add(arr1,arr2);
    System.out.println("first 2-d array");
    print(arr1);
    System.out.println("second 2-d array");
    print(arr1);
    System.out.println("sum of 2-d arrays");
    print(sum);

    

  }
}

