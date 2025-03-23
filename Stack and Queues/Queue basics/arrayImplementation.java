public class arrayImplementation {

  public static class queueA
  {
    int f=-1;
    int r=-1;
    int []arr= new int[100];

    public void add(int n)
    {
      if(r==-1 && f==-1)
      {
        r++;
        f++;
        arr[r]=n;
      }
      else if(r==arr.length-1)
      {
        System.out.println("Overflow");
        return;
      }
      else
      {
        r++;
        arr[r]=n;
      }
    }

    public int remove()
    {
      if(f==-1)
      {
        System.out.println("Underflow");
        return -999;
      }
      else if(f==r)
      {
        int x=arr[f];
        f=-1;
        r=-1;
        return x;
      }
      else
      {
        return arr[f++];
      }
    }

    public int peek()
    {
      return arr[f];
    }

    public void display()
    {
      for(int i=f;i<=r;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  } 
  public static void main(String[] args) {
    queueA q= new queueA();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.remove();
    
    q.display();


  }
}
