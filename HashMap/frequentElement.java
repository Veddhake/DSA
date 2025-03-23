import java.util.*;

public class frequentElement {
  public static int freq(int[]arr)
  {
    Map<Integer,Integer> mp = new HashMap<>();

    for(int i=0;i<arr.length;i++)
    {
      if(!mp.containsKey(arr[i]))
      {
        mp.put(arr[i], 1);
      }
      else
      {
        
        mp.put(arr[i],mp.get(arr[i])+1);
      }
    }

    int max=0;
    int ans=-1;

    for(var e: mp.entrySet())
    {
      if(e.getValue()>max)
      {
        max=e.getValue();
        ans=e.getKey();
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[]arr={1,2,3,1,1,2,3,2,2};
    System.out.println(freq(arr));
  }
}
