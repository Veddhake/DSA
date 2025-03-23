package Basics;

public class maxValueOfArray {

  public static int max(int[]n,int len)
  {
    if(len==0)
    {
      return n[len];
    }

    int m=max(n,len-1);

    if(n[len]>m)
    {
      return n[len];
    }
    else
    {
      return m;
    }

  }

  public static void main(String[] args) {

    int[]arr={5,7,9,10,2,3};

    System.out.println(max(arr,arr.length-1));
    
  }
  
}
