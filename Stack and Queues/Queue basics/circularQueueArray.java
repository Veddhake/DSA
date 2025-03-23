public class circularQueueArray {

  public static class cqa
  {
    int f=-1;
    int r=-1;
    int size=0;
    int[]arr=new int[5];

    public void add(int n)
    {
       if(size==arr.length)
      {
        System.out.println("Overflow");
        return;
      }
      else if(f==-1)
      {
        f++;
        r++;
        arr[r]=n;
        size++;
      }
      else if(r<arr.length-1)
      {
        arr[++r]=n;
        size++;
      }
      
      else if(r==arr.length-1)
      {
        r=0;
        arr[r]=n;
        size++;
        
      }
    }

    public int remove()
    {
      if(f==r)
      {
        int x=arr[f];
        f=-1;
        r=-1;
        size--;
        return x;
      }
      else if(size == 0)
      {
        System.out.println("Underflow");
        return -1;
      }
      else if(f<arr.length-1)
      {
        int x=arr[f];
        f++;
        size--;
        return x;
      }
      else if(f==arr.length-1 && r<f)
      {
        int x=arr[f];
        f=0;
        size--;
        return x;
      }
      else return -1;


    }

    public void display()
    {
      if(r>=f)
      {
        int i=f;
        while(r>=i)
        {
          System.out.println(arr[i++]);
        }
      }
      else if(r<f)
      {
        int i=f;
        while(i!=arr.length)
        {
          System.out.println(arr[i++]);
        }
        i=0;
        while(i<=r)
        {
          System.out.println(arr[i++]);
        }
      }
      return;


    }
  }
  public static void main(String[] args) {
    cqa q= new cqa();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.remove();
    q.display();
    q.add(6);
    q.display();
    q.remove();
    q.add(999);
    q.display();
  }
}
