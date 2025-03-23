import java.util.*;

public class RemoveFromBottom {
  public static void main(String[] args) {
    Stack<Integer> st1= new Stack<>();
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);

    Stack<Integer> st2= new Stack<>();

    
   while(st1.size()!=1)
   {
    st2.push(st1.pop());
   }

st1.pop();
   while(st2.size()!=0)
   {

    st1.push(st2.pop());
   }
   System.out.println(st1);
  }
}
