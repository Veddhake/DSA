package Basics;

public class sumOfArray {

  public static int sum(int[]arr,int idx)
  {
    if(idx==arr.length-1)
    {
      return arr[idx];
    }

    return arr[idx]+sum(arr,idx+1);

  }

  public static void main(String[] args) {

    int []arr={1,2,3,4,5};
    System.out.println(sum(arr,0));
    
  }
  
}
