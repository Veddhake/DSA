
public class basicsll{
  public static class Node{
    int data;
    Node next;

    Node(int data)
    {
      this.data=data;
    }
  }

  public static void display(Node head)   // Iterative display of linked list
  {
    Node temp=head;

    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }

  public static void rec_display(Node head)    // Recursive display of linked list
  {

    if(head==null)
    {
      return;
    }
    System.out.println(head.data);
  
    rec_display(head.next);
  }

  public static void rec_reversedisplay(Node head)    // Recursive display of reversed linked list
  {

    if(head==null)
    {
      return;
    }

    rec_display(head.next);

    System.out.println(head.data);
  
    
  }

  public static int length(Node head)     // Iterative length of LL
  {
    int len=0;
    while(head!=null)
    {
      len++;
      head=head.next;
    }
    return len;
  }

  public static int rec_length(Node head)     // Recursive length of LL
  {
    if(head==null)
    {
      return 0;
    }

    return 1+ rec_length(head.next);
  }



  public static void main(String[]args)
  {
    Node a=new Node(5);
    Node b=new Node(6);
    Node c=new Node(9);
    Node d=new Node(10);
    Node e=new Node(19);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;

    Node head=a;

    System.out.println(rec_length(head));
    
  }
}