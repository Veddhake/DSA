public class LLimplementation {

  public static class Node
  {
    int val;
    Node next;

    Node(int val)
    {
      this.val=val;
    }
  }

  public static class queueLL
  {
    Node head=null;
    Node tail=null;
    int size=0;

    public void add(int n)
    {
      Node x= new Node(n);
      if(head==null)
      {
        head=x;
        tail=head;
        size++;
      }
      else
      {
        
        tail.next=x;
        tail=x;
        size++;
      }
    }

    public int remove()
    {
      if(head==null)
      {
        System.out.println("Underflow");
        return -999;
      }
      else if(head.next==null)
      {
        int x=head.val;
        head=tail=null;
        size--;
        return x;
      }
      else
      {
        int x=head.val;
        head=head.next;
        size--;
        return x;
      }

    }

    public void display()
    {
      Node temp=head;
      while(temp!=null)
      {
        System.out.println(temp.val);
        temp=temp.next;
      }
      return;
    }

    public int peek()
    {
      return head.val;
    }
  }
  public static void main(String[] args) {
    queueLL q= new queueLL();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.remove();
    q.display();

  }
}
