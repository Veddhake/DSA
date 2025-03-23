import java.util.*;

public class removeConsecutiveSubsequences {
  public static int[] remove(int[]arr)
  {
    Stack<Integer> st= new Stack<>();
    st.push(arr[0]);
    int j=2;
    for(int i=1;i<arr.length-1;i++)
    { 
      if(arr[i]!=st.peek())
      {
        st.push(arr[i]);
      }
      else if(arr[i]==st.peek() && arr[j]!=arr[i])
      {
        st.pop();
      }
      j++;
    }

    if(arr[arr.length-1]!=st.peek())
    {
      st.push(arr[arr.length-1]);
    }

    int res[]=new int[st.size()];

    for(int i=res.length-1;i>=0;i--)
    {
      res[i]=st.pop();
    }
    return res;
  }

  public static void main(String[] args) {
    int[]arr={1,2,2,3,4,4,4,5,5,5,5,6,7,7,7,8,9,10,10,10};
    int[]rem=remove(arr);

    for(int i=0;i<rem.length;i++)
    {
      System.out.print(rem[i]+" ");
    }
  }
}
