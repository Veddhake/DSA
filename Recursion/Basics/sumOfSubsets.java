package Basics;

public class sumOfSubsets {

  public static void sumOfSubsets(int[]arr,int len,int idx, int sum)
  {
    if(idx==len)
    {
      System.out.println(sum);
      return;
    }

    int x=arr[idx];
    sumOfSubsets(arr,len,idx+1,sum+x);
    sumOfSubsets(arr,len,idx+1,sum);

  }
  public static void main(String[] args) {

    int[]arr={1,2,3};
    sumOfSubsets(arr,arr.length,0,0);
    
  }
  
}
