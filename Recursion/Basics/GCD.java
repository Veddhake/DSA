package Basics;

public class GCD {

  public static int gcd(int n1, int n2)
  {
    if(n1%n2==0)
    {
      return n2;
    }
    return gcd(n2,n1%n2);

    

  }
  public static void main(String[] args) {
    System.out.println(gcd(30,25));
  }
  
}
