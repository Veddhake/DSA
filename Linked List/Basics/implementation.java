public class implementation {

  public static class Node
  {
    int data;
    Node next;

    Node(int data)
    {
      this.data=data;
    }
  }

  public static class LinkedList
  {
    Node head=null;
    Node t =head;

    void display(Node head)      // displaying linked list
    {
      Node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.data + " -> ");
        temp=temp.next;
      }
      System.out.println();
    }

    int size()
    {
      int count=0;
      Node temp=head;

      while(temp!=null)
      {
        count++;
        temp=temp.next;
      }
      return count;
    }

    Node insertAtEnd(int n)     // inserting a node in last position
    {
      Node temp=new Node(n);

      if(head==null)
      {
        head=temp;
        t=head;
      }
      else
      {
        Node temph=head;

        while(temph.next!=null)
        {
          temph=temph.next;
        }
        temph.next=temp;
      }

      return temp;
    }

    void insertAtBeginning(int n)     // inserting a node at the start
    {
      Node temp= new Node(n);
      temp.next=head;
      head=temp;
    }

    void insert(int n, int index)     // inserting node at any position
    {
      Node temp= new Node(n);
      if(index==0)
      {
        temp.next=head;
        head=temp;
      }
      else
      {
        Node temph = head;
        
        for(int i=1;i<index;i++)      // returns index of element before the insert the position
        {
          temph=temph.next;
        }

        temp.next=temph.next;
        temph.next=temp;
      }
    }

    int getElement(int index)     //getting an element at particular position in linkedlist
    {
      Node temph=head;

      for(int i=0;i<index;i++)    // returns index of element at the position
      {
        temph=temph.next;
      }

      return temph.data;
    }

    void deleteAtindex(int index)
    {
      if(index==0)
      {
        head=head.next;
      }
      else
      {
        Node temph= head;

        for(int i=1;i<index;i++)
        {
          temph=temph.next;
        }

        temph.next=temph.next.next;
      }
    }
  //   boolean palindrome(Node n1, Node n2)
  //   {
  //       System.out.println(n1.data + "        " + n2.data);
  //       if(n2!=null)
  //       {

  //           if palindrome(n1,n2.next)
  //           {
  //             n1 = n1.next
  //           };


  //       }
  //       else
  //       {
  //         if(n2.data==n1.data)
  //         {
  //           n1=n1.next;
  //           return true;
  //         }
  //         else
  //         {
  //           return false;
  //         }
  //       }
  //       return true;
  //   }

  
  
  boolean rev(Node h)
  {
    if(h==null)
    {
      return true;
    }

    
    boolean b=rev(h.next);

    if(b==false)
    {
      return false;
    }
    
    
   if(t.data!=h.data)
   {
    return false;
   } 

    t=t.next;
    return true;
  }

  static Node segregate(Node head) {
        
    if(head==null||head.next==null)
    {
        return head;
    }
    Node zero=new Node(-1);
    Node one = new Node(-1);
    Node two=new Node(-1);
    
    Node znext=zero;
    Node onext=one;
    Node tnext=two;
    
    Node temp =head;
    
    while(temp!=null)
    {
        Node next=temp.next;
        temp.next=null;

        if(temp.data==0)
        {
            znext.next=temp;
            znext=temp;
            


        }
        else if(temp.data==1)
        {
            onext.next=temp;
            onext=temp;
            
        }
        else
        {
            tnext.next=temp;
            tnext=temp;
            
        }
        
        temp=next;
    }
    
    Node start=null;
    Node tail=null;
    
    if(znext.data!=-1)
    {
        start=zero.next;
        tail=znext;
    }
    
    if(onext.data!=-1)
    {
        if(start==null)
        {
            start=one.next;
            tail=onext;
        }
        else
        {
            tail.next=one.next;
            tail=onext;
        }
        
    }
    
    if(tnext.data!=-1)
    {
        if(start==null)
        {
            start=two.next;
            tail=tnext;
        }
        else
        {
            tail.next=two.next;
            tail=tnext;
        }
        
    }

    return start;
    
    
    

    
    
   
    
  }
}

  public static void main(String[]args)
  {
    LinkedList ll= new LinkedList();
    Node h=ll.insertAtEnd(0);
    ll.insertAtEnd(2);

    Node n=ll.insertAtEnd(0);

    ll.insertAtEnd(2);
   

    ll.display(h);
    Node start=ll.segregate(h);
     ll.display(start);


  }  
}
