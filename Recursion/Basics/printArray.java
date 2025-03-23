package Basics;

public class printArray {

  public static void print(int[]n,int len)
  {
    if(len<0)
    {
      return;
    }

    print(n,len-1);

    System.out.println(n[len]);
  }
  public static void main(String[] args) {
    int[]arr={5,7,8,9,2};
    print(arr,arr.length-1);
  }
}
