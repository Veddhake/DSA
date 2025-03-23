package Basics;

public class sumOfNumsWithAlternateSigns {

  public static int sum(int n)
  {
    if(n==0)
    {
      return 0;
    }

    int s=sum(n-1);

    if(n%2==1)
    {
      return s+=n;
    }
    else{
      return s+=-1*n;
    }
  }

  public static void main(String[] args)
  {
    System.out.println(sum(5));
  }
  
}
