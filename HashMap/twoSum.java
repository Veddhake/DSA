import java.util.*;

public class twoSum {

  public static int[] sum(int[]arr,int target)
  {
    Map<Integer,Integer>mp=new HashMap<>();
    int[]ans={-1};

    for(int i=0;i<arr.length;i++)
    {
      if(!mp.containsKey(arr[i]) && !mp.containsValue(arr[i]))
      {
        mp.put(target-arr[i],i);
      }
      else if(mp.containsKey(arr[i]))
      {
        ans= new int[]{i,mp.get(arr[i])};
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[]arr={1,2,3,5,7,5};

    System.out.println(sum(arr,10));
    
  }
  
}
