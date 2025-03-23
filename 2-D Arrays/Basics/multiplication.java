import java.util.*;

public class multiplication {

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

  public static int[][] multiply(int[][]arr1,int[][]arr2)
  {
    int r=arr1.length;
    int c=arr2[0].length;
    int[][] product= new int[r][c];

    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        int sumofprod=0;
        for(int z=0;z<arr1[i].length;z++)
        {
          sumofprod+=arr1[i][z]*arr2[z][j];
        }
        product[i][j]=sumofprod;
      }
    }

    return product;
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
    int[][]product=multiply(arr1,arr2);
    System.out.println("first 2-d array");
    print(arr1);
    System.out.println("second 2-d array");
    print(arr2);
    System.out.println("multiplication of 2-d arrays");
    print(product);

    

  }
}


