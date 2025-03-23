import java.util.*;

public class largestAreaInHistogram {

  public static int largestArea(int[] heights)
  {
    int[] next=nextSmallerElement(heights);
    int[]prev = prevSmallerElement(heights);
    int max=-1;
    int area=-1;
    for(int i=0;i<heights.length;i++)
    {
      area=heights[i]*(next[i]-prev[i]-1);
      max=Math.max(max,area);
    }

    return max;
  }

  public static int[] nextSmallerElement(int [] heights)
  {
    Stack<Integer> st= new Stack<>();
    int[] next = new int[heights.length];

    st.push(heights.length-1);
    next[next.length-1]=next.length;

    for(int i=next.length-2;i>=0;i--)
    {
      while(st.size()!=0 && heights[i]<=heights[st.peek()])
      {
        st.pop();
      }

      if(st.size()==0)
      {
        next[i]=next.length;
        st.push(i);
      }
      else
      {
        next[i]=st.peek();
        st.push(i);
      }
    }

    return next;
    
      
  }

  public static int[] prevSmallerElement(int[]heights)
  {
    Stack<Integer> st = new Stack<>();
    int[]prev = new int[heights.length];

    st.push(0);
    prev[0]=-1;
    for(int i=1;i<prev.length;i++)
    {
      
      while(st.size()!=0 && heights[i]<=heights[st.peek()] )
      {
        st.pop();
      }

      if(st.size()==0)
      {
        prev[i]=-1;
        st.push(i);
      }
      else
      {
        prev[i]=st.peek();
        st.push(i);

      }
    }

    return prev;


  }

  public static void main(String[] args) {
    int[]arr={2,1,5,6,2,3};
    int[]pre=nextSmallerElement(arr);

    for(int i=0;i<pre.length;i++)
    {
      System.out.print(largestArea(arr)+" ");
    }


  }
  
}
