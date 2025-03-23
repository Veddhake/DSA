import java.util.Stack;

public class InsertAtBottom {
  public static void main(String[] args) {
    Stack<Integer> st1= new Stack<>();
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);

    Stack<Integer> st2= new Stack<>();

   while(st1.size()!=0)
   {
    st2.push(st1.pop());
   }

   st1.push(5);

   while(st2.size()!=0)
   {

    st1.push(st2.pop());
   }
   System.out.println(st1);
    

  }
}
