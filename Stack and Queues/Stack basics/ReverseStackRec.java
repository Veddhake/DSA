import java.util.Stack;

public class ReverseStackRec {

  public static void pushAtBottom(Stack<Integer>st, int x)
  {
    if(st.size()==0)
    {
      st.push(x);
      return;
    }

    int el=st.pop();
    pushAtBottom(st, x);
    st.push(el);


  }

  public static void reverse(Stack<Integer>st)
  {
    if(st.size()==0)
    {
      return;
    }

    int x=st.pop();
    reverse(st);
    pushAtBottom(st,x);
  }
  public static void main(String[] args) {
     Stack<Integer> st1= new Stack<>();
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);
    reverse(st1);
    System.out.println(st1);
  }
}
