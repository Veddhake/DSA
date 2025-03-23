// Consider an Array, The Array must be partioned in such a way in two halves that both the halves elements sums must be equal. We will be using the Prefix & Suffix sum approach. If array can be partitioned return true else false. Other approach ca be by only using Prefix Sum but in this implementation we are comparing the prefix and suffix sums.

import java.util.*;

public class equalPartitionSum {

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

  public static int[] suffixSumArray(int []arr)
  {
    int n=arr.length;
    int[] suff=new int[n];

    suff[n-1]=arr[n-1];

    for(int i=n-2;i>=0;i--)
    {
      suff[i]=suff[i+1]+arr[i];
    }

    return suff;

  }

  public static boolean isEqualPartitionExists(int[] pref,int[]suff)
  {
    for(int i=0;i<pref.length-1;i++)
    {
      if(pref[i]==suff[i+1])
      {
        return true;
      }
    }

    return false;
  }

 

 

  public static void main(String[] args)
  {
    int[]arr= {2,1,2,1,4};
    int[]pref=prefixSumArray(arr);
    int[]suff=suffixSumArray(arr);
    print(arr);
    print(pref);
    print(suff);
    System.out.println(isEqualPartitionExists(pref, suff));
  }
}
