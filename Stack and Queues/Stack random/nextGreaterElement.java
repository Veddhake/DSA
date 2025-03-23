import java.util.*;

public class nextGreaterElement {

  public static int[] great(int[]arr)
  {
    int[] res= new int[arr.length];
    Stack<Integer> st= new Stack<>();

    st.push(arr[arr.length-1]);
    res[res.length-1]=-1;
    for(int i=arr.length-2;i>=0;i--)
    {
      while(st.size()>0 && arr[i]>st.peek())
      {
        st.pop();
      }
      if(st.size()==0)
      {
        res[i]=-1;
        st.push(arr[i]);
      }
      else if(arr[i]<st.peek())
      {
        res[i]=st.peek();
        st.push(arr[i]);
      }
    }

    return res;


  }
  public static void main(String[] args) {

    int[]arr={1,5,3,2,1,6,3,4};
    int[]res=new int[arr.length];
    res=great(arr);

    for(int i=0;i<res.length;i++)
    {
      System.out.print(res[i] + " ");
    }
    
    
  }
}
