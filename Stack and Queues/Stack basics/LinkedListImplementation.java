public class LinkedListImplementation {
  public static class Node
  {
    int val;
    Node next;
    Node(int val)
    {
      this.val=val;
    }
  }

  public static class LLStack
  {
    Node head=null;
    int size=0;

    void push(int x)
    {
      Node temp = new Node(x);
      if(head==null)
      {
        head=temp;
        
      }
      else
      {
        temp.next=head;
        head=temp;
      }
      size++;
    }

    void display()
    {
      displayrec(head);
    }

    void displayrec(Node h)
    {
      
      if(h==null)
      {
        return;
      }
      displayrec(h.next);
      System.out.println(h.val);
    }

    int pop()
    {
      if(head==null)
      {
        System.out.println("Stack Undeflow");
        return -1;
      }
      int temp= head.val;
      head=head.next;
      return temp;
    }
  }

  public static void main(String[] args) {
    LLStack st= new LLStack();
    st.push(1);
    st.push(2);

    st.push(3);

    st.display();
    st.pop();
    st.display();
  }
}
