package Basics;

public class sumOfDigits {

  public static int sum(int n)
  {
    if(n==0)
    {
      return 0;
    }

    return sum(n/10)+n%10;

  }
  public static void main(String[]args)
  {
    System.out.print(sum(1234));
  }
}
