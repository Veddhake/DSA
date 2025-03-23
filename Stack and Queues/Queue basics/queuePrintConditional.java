import java.util.*;

public class queuePrintConditional
{
  public static void main(String[] args) {
    Queue<Integer> q1= new LinkedList<>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);

    Queue<Integer> q2= new LinkedList<>();

    while(q1.size()!=0)
    {
      System.out.print(q1.peek());
      q2.add(q1.peek());
      q1.remove();
    }

  }
}