import java.util.*;

public class binarySubarrayWithSum {

  public static int count(int[]arr, int k)
  {
    return help(arr,k) - help(arr,k-1);

}

public static int help(int[]arr,int k)
{
  if(k<0)
  {
    return 0;
  }
  int count=0;
    int sum=0;
    int start=0;
    for(int i=0;i<arr.length;i++)
    {
      
      sum+=arr[i];
      while(sum>k)
      {
        sum=sum-arr[start];
        start=start+1;
      }
      count+=i-start+1;
    } 
    return count;
}
  public static void main(String[] args) {
    int[]arr={0, 0, 0, 0};
    System.out.println(count(arr,0));
  }
}
