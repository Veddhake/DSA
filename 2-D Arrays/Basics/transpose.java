// This implementation is for in-place transpose and hence is only applicable for N x N matrices. For M x N matrices we will have to make  a new 2-D array since rows and columns get swapped. 

import java.util.*;

public class transpose {

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

  public static void main(String[] args)
  {
    int[][]arr1= make2dArray();
    print(arr1);
    transposeOf(arr1);
    print(arr1);

    

  }
}

