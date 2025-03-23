import java.util.*;

public class fruitsInBasket {
  
  public static int longest(int[]arr)
  {
    int idx1=-1;
    int idx2=-1;
    int max=0;
    int start=0;
   
    for(int i=0;i<arr.length;i++)
    {
      
      if(idx1==-1 || arr[i]==arr[idx1])
      {
        idx1=i;
       
      }
      else if(idx2==-1 || arr[i]==arr[idx2])
      {
        idx2=i;
       
      }
      else
      {
        start=Math.min(idx1,idx2)+1;
        if(idx1<idx2)
        {
          idx1=idx2;
        }
 
        idx2=i;
      }
      
      max=Math.max(max,i-start+1);
    }
    return max;
  }
  public static void main(String[] args) {
    int[]arr= {1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 1, 1, 1, 1};
    System.out.println(longest(arr));
    
  }  
}
