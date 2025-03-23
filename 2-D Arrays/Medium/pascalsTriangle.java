// The pattern that is formed is if we take the transpose of the matrix and then for each row we reverse the row, the resulting 2-D array formed will have been rotated by 90 degrees.

import java.util.*;

public class pascalsTriangle {

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

  public static int[][] pascal(int r)
  {
    int[][] pasctri= new int[r][];


    for(int i=0;i<r;i++)
    {
      pasctri[i]= new int[i+1];
      pasctri[i][0]=1;
      pasctri[i][i]=1;
      for(int j=1;j<i;j++)
      {       
          pasctri[i][j]=pasctri[i-1][j-1]+pasctri[i-1][j];
      }
      
    }

    return pasctri;

  }

 
  public static void main(String[] args)
  {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number of required rows in Pascals Triangle");

    int r=sc.nextInt();

    int[][]arr= pascal(r);

    print(arr);
    

    

  }
}

