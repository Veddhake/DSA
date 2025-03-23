package Basics;

public class countOfDigits {

  public static int cod(int n)
  {
    if(n==0)
    {
      return 0;
    }

    return cod(n/10)+1;
  }
  public static void main(String[]args)
  {
    System.out.println(cod(1425));
  }
}
