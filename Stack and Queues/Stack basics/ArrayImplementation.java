public class ArrayImplementation {
  public static class Stack{
    private int[] arr= new int[5];
    int idx=0;

    void push(int x)
    {
      if(idx==arr.length-1)
      {
        System.out.println("Stack Overflow");
        return;
      }
      arr[idx++]=x;
    }

    int peek()
    {
      if(idx==0)
      {
        System.out.println("Empty Stack");
        return -1;
      }
      return arr[idx-1];
    }

    int pop()
    {
      if(idx==0)
      {
        System.out.println("Empty Stack");
        return -1;
      }

      int t=arr[idx-1];
      arr[idx-1]=0;
      idx--;
      return t;
    }

    void display()
    {
      for(int i=0;i<idx;i++)
      {
        System.out.println(arr[i]);
      }
    }
  }

  public static void main(String[] args) {
    Stack  st= new Stack();
    st.push(1);
    st.display();
  }
}
