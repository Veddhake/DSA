import java.util.*;

public class display {
  
  public static void print(Stack<Integer> st)
  {
    if(st.size()==0)
    {
      return;
    }

    int x=st.pop();
    print(st);
    System.out.println(x);
  }
  public static void main(String[] args) {
    Stack<Integer> st1= new Stack<>();
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);
    print(st1);

  }
}
