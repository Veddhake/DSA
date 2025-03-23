import java.util.*;

public class intro {

  public static void print(int []arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }

 public static int[] prefixSumArray(int []arr)
 {
  int n=arr.length;
  int[] pref= new int[n];

  pref[0]=arr[0];

  for(int i=1;i<n;i++)
  {
    pref[i]=pref[i-1]+arr[i];
  }

  return pref;
 }

 

  public static void main(String[] args)
  {
    int[]arr= {2,1,2,3,4};
    int [] pref=prefixSumArray(arr);
    print(arr);
    print(pref);

  }
}
