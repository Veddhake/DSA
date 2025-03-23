import java.util.*;

public class displayRev {
  
  public static void printRev(Stack<Integer> st)
  {
    if(st.size()==0)
    {
      return;
    }

    int x=st.pop();
    System.out.println(x);
    printRev(st);
    
  }
  public static void main(String[] args) {
    Stack<Integer> st1= new Stack<>();
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);
    printRev(st1);

  }
}
