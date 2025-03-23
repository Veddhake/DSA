package Basics;



public class fibonacci {

  public static int fibo(int n)
  {
    if(n==1)
    {
      return 0;
    }
    if(n==2)
    {
      return 1;
    }

    

    int x= fibo(n-1)+fibo(n-2);
    
    return x;


   
  }
  public static void main(String[] args) {
    fibo(5);
  }
}
