// The pattern that is formed is if we take the transpose of the matrix and then for each row we reverse the row, the resulting 2-D array formed will have been rotated by 90 degrees.

import java.util.*;

public class rotateBy90 {

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

  public static void transposeOf(int[][]arr)
  {
    int r = arr.length;
    int c = arr[0].length;
    
    for(int i=0;i<r;i++)
    {
      for(int j=i;j<c;j++)
      {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }
    return;
  }

  public static void reverseEachRow(int[][]arr)
  {
    int r=arr.length;
    int c=arr[0].length;

    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c/2;j++)
      {
        int temp=arr[i][j];
        arr[i][j]=arr[i][r-j-1];
        arr[i][r-j-1]=temp;
      }
    }
    return;
  }

  public static void rotate(int[][]arr)
  {
    transposeOf(arr);
    reverseEachRow(arr);

    return;
  }

  public static void main(String[] args)
  {
    int[][]arr1= make2dArray();
    print(arr1);
    rotate(arr1);
    print(arr1);

    

  }
}

