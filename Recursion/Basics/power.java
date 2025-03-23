package Basics;

public class power {


  public static int pow(int p, int q)
  {
    if(q==0)
    {
      return 1;
    }

    return pow(p,q-1)*p;
  }

  public static int pow2(int p, int q)
  {
    if(q==0)
    {
      return 1;
    }
    else if(q%2==1)
    {
      return p*pow(p,q/2)*pow(p,q/2);
    }
    else
    {
      return pow(p,q/2)*pow(p,q/2);
    }

    
  }


  public static double myPow(double x, int n) {


    if(n==0)
    {
        return 1;
    }
    if(n>0 && n%2==0)
    {
        return myPow(x,n/2)*myPow(x,n/2);
    }
    else if(n>0 && n%2==1)
    {
        return x*myPow(x,n/2)*myPow(x,n/2);
    }
    else if(n<0 && n%2==0)
    {
        return myPow(x,n/2)*myPow(x,n/2);
    }
    else
    {
        return (1/x)*myPow(x,n/2)*myPow(x,n/2);
    }

    

    
}

  public static void main(String [] args)
  {
    System.out.println(pow(5,3));
    System.out.println(pow2(2,3));
    System.out.println(myPow(1, 2147483647));
    System.out.println(7/2);
  }

  
}
