// Given a number N make a matrix N x N such that it consists of elements from 1 to N^2. When traversed in spiral order, the resultant traversal should be in ascending order of the numbers sequentially arranged (eg:- 1,2,3,4,5,6,7,8,9)


import java.util.*;

public class spiralMatrixGeneration {

  public static void print(int [][]arr)   // only to print the spiral matrix
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

  public static int[][] makeSpiralMatrix()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");

    int n = sc.nextInt();
    int[][]arr = new int[n][n];

    int left=0;
    int right=n-1;
    int top=0;
    int bottom=n-1;
    int curr=1;

    while( left<=right && top<=bottom)
    {
      for(int i=left;i<=right;i++)
      {
        arr[top][i]=curr++;
      }  

      for(int i=top+1;i<=bottom;i++)
      {
        arr[i][right] = curr++;
      }

      for(int i=right-1;i>=left;i--)
      {
        arr[bottom][i]=curr++;
      }

      for(int i=bottom-1;i>top;i--)
      {
        arr[i][left]=curr++;
      }

      left++;
      right--;
      top++;
      bottom--;

    }

    return arr;

    
  }

  public static void spiralPrint(int[][]arr)
  {
    int r=arr.length;
    int c=arr[0].length;

    int left=0;
    int right=c-1;

    int top=0;
    int bottom=r-1;

    while(left<=right && top<=bottom)
    {
      for(int i=left;i<=right;i++)
      {
        System.out.print(arr[top][i] + " ");
      }

      for(int i=top+1;i<=bottom;i++)
      {
        System.out.print(arr[i][right]+ " ");
      }

      for(int i=right-1;i>=left;i--)
      {
        System.out.print(arr[bottom][i]+ " ");
      }

      for(int i=bottom-1;i>top;i--)
      {
        System.out.print(arr[i][left]+ " ");
      }

      left++;
      right--;
      top++;
      bottom--;
    }

  }

  public static void main(String[] args)
  {
    int[][]arr1= makeSpiralMatrix();
    print(arr1);
    spiralPrint(arr1);
    

  }
}
