import java.util.*;

public class longestConsecutiveOnesFlip
{
  public static int longest(int[]arr, int k)
  {
    int start=0;
    
    Queue<Integer> qu= new LinkedList<>();

    int max=-1;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==0)
      {
        
        
          qu.add(i);
      }
        if(qu.size()>k)
        {
          start=qu.remove()+1;
        } 

        
      

      max=Math.max(max,i-start+1);

    }

    return max;
  }
  public static void main(String[] args) {
    int arr[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    System.out.println(longest(arr,3));
  }
}