import java.util.*;


public class longestSubarray {

  public static int longest(int[]arr)
  {
    Map<Integer,Integer> mp = new HashMap<>();
    int sum=0;
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
      if(!mp.containsKey(sum))
      {
        mp.put(sum,i);
      }
      if(sum==0)
      {
        if(i+1>max)
        {
          max=i+1;
        }
      }
      else
      {
        if(i-mp.get(sum)>max)
        {
          max=i-mp.get(sum);
        }
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[]arr={-2,2,10,2,3};
    System.out.println(longest(arr));
  }
}
