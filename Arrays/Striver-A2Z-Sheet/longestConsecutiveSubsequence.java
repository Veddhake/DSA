
import java.util.*;

public class longestConsecutiveSubsequence {
  

  public static int longestConsecSubseq(int[]arr)
  {
    Set<Integer> set= new HashSet<>();

    for(int i=0;i<arr.length;i++)
    {
      set.add(arr[i]);
    }

    int count =0;
    int longest=0;

    for(int el : set)
    {
      count=1;
      while(set.contains(el+1))
      {
        count++;
        el++;
      }
      if(count>longest)
      {
        longest = count;
      }
    }
    return longest;
  } 

  public static void main(String[] args)
  {
      int [] arr={100,200,3,1,2,4,17,19,16,12,100,2929,2563,13,14,234,15,18};
      System.out.println(longestConsecSubseq(arr));
  }
}
