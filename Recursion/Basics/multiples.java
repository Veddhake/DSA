package Basics;

public class multiples {

  public static void mult(int n, int k)
  {
    if(k==0)
    {
      return;
    }

    mult(n,k-1);
    System.out.print(n*k+" ");
    
  }

  public static void main(String[]args)
  {
    mult(5,4);
  }
  
}
