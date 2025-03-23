import java.util.Stack;

public class InsertAtIndex {
  public static void main(String[] args) {
    Stack<Integer> st1= new Stack<>();
    int index =1;
    int item =777;
    st1.push(1);
    st1.push(2);

    st1.push(3);
    st1.push(4);

    Stack<Integer> st2= new Stack<>();

   while(st1.size()!=index)
   {
    st2.push(st1.pop());
   }

   st1.push(item);

   while(st2.size()!=0)
   {
    st1.push(st2.pop());
   }

   System.out.println(st1);


  }
}
