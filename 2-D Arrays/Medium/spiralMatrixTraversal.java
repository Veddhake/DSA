
import java.util.*;

public class spiralMatrixTraversal {

 
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

      if(top<bottom)
      {
        for(int i=right-1;i>=left;i--)
        {
          System.out.print(arr[bottom][i]+ " ");
        }
      }

      if(left<right)
      {

        for(int i=bottom-1;i>top;i--)
        {
          System.out.print(arr[i][left]+ " ");
        }
      }
      left++;
      right--;
      top++;
      bottom--;
    }

  }

  public static void main(String[] args)
  {
    int[][]arr1= make2dArray();
    spiralPrint(arr1);
    

  }
}

