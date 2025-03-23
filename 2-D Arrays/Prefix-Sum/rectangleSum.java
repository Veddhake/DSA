import java.util.*;

public class rectangleSum {

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

  public static int findSum1(int[][]arr,int r1,int r2,int c1, int c2) // Brute Force Approach
  {
    int sum=0;

    for(int i=r1;i<=r2;i++)
    {
      for(int j=c1;j<=c2;j++)
      {
        sum+=arr[i][j];
      }
    }
    return sum;

  }

  public static int findSum2(int[][]arr,int r1,int r2,int c1, int c2) // Prefix sum of each row and then adding the required elements to get  the sum
  {
    int r=arr.length;
    int c=arr[0].length;

    for(int i=0;i<r;i++)  // Each Row has its own prefix sum arrays 
    {
      int sum=0;
      for(int j=0;j<c;j++)
      {
        sum+=arr[i][j];
        arr[i][j]=sum;
      }
    }

    int finalSum=0;

    for(int i=r1;i<=r2;i++)
    {
      if(c1>=1)
      {
        finalSum+=arr[i][c2]-arr[i][c1-1];
      }
      else
      {
        finalSum+=arr[i][c2];
      }
    }
    
    return finalSum;

  }

  public static int findSum3(int[][]arr,int r1,int r2,int c1, int c2) // Prefix sum of each row and then prefix sum of each column on top of that. It is observed that at any point from the origin, you get the sum of the area of rectangle from that point till origin at that point. required to make certain subtractions to find the area of required rectangle.
  {
    int r=arr.length;
    int c=arr[0].length;

    for(int i=0;i<r;i++)  // Row-wise prefix sum
    {
      int sum=0;
      for(int j=0;j<c;j++)
      {
        sum+=arr[i][j];
        arr[i][j]=sum;
      }
    }

    for(int j=0;j<c;j++)  //column-wise prefix sum
    {
      int sum=0;
      for(int i=0;i<r;i++)
      {
        sum+=arr[i][j];
        arr[i][j]=sum;
      }
    }

    print(arr);
    if(c1==0)
    {
      return arr[r2][c2];
    }
    else if(r1==0)
    {
      return arr[r2][c2]-arr[r2][c1-1];
    }
    else
    {
      return arr[r2][c2]-arr[r2][c1-1]-arr[r1-1][c2]+arr[r1-1][c1-1];
    }



  }

  public static void main(String[] args)
  {
    int[][]arr1= make2dArray();
    
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter r1");
    int r1=sc.nextInt();
    System.out.println("Enter c1");
    int c1=sc.nextInt();
    System.out.println("Enter r2");
    int r2=sc.nextInt();
    System.out.println("Enter c2");
    int c2=sc.nextInt();

    System.out.println(findSum3(arr1, r1, r2, c1, c2));

  }
}

