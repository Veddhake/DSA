package Basics;

public class printNums{

  public static void print1n(int n)
  {
    if(n==0)
    {
      return;
    }
    print1n(n-1);

    System.out.print(n + " ");
  }

  public static void printn1(int n)
  {
    if(n==0)
    {
      return;
    }
    System.out.print(n +" ");
    printn1(n-1);
  }


  public static void main(String[]args)
  {
    print1n(7);
    System.out.println();
    printn1(7);
  }
}