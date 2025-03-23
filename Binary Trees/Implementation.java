

public class Implementation
{

  public static class Node
  {
    int val;
    Node left;
    Node right;
    Node(int val)
    {
      this.val=val;
    }
  }

  public static void display(Node root)
  {
    if(root==null)
    {
      return;
    }
    System.out.print(root.val + " children ");
    if(root.left==null)
    {
      System.out.print("n");
    }
    else{
      System.out.print(root.left.val);
    }
    if(root.right==null)
    {
      System.out.println("n");
    }
    else{
      System.out.println(root.right.val);
    }
    display(root.left);
    display(root.right);
  }

  public static int size(Node root)
  {
    if(root==null)
    {
      return 0;
    }
  
    return size(root.left)+size(root.right)+1;
  }

  public static int sum(Node root)
  {
    if(root==null)
    {
      return 0;
    }
    return sum(root.left)+sum(root.right)+root.val;
  }

  public static int max(Node root)
  {
    if(root==null)
    {
      return Integer.MIN_VALUE;
    }

    return Math.max(root.val,Math.max(max(root.right),max(root.left)));

  }

  public static int height(Node root)
  {
    if(root==null)
    {
      return 0;
    }
    if(root.left==null && root.right==null)
    {
      return 0;
    }

    return 1+Math.max(height(root.left),height(root.right));
  }

  public static int minimum(Node root)
  {
    if(root==null)
    {
      return Integer.MAX_VALUE;
    }

    return Math.min(root.val,Math.min(minimum(root.left),minimum(root.right)));
  }

  public static int product(Node root)
  {
    if(root==null)
    {
      return 1;
    }

    return root.val*product(root.left)*product(root.right);
  }
  public static void main(String[] args) {
    Node root = new Node(2);
    Node a = new Node(4);
    Node b = new Node(10);
    root.left=a;
    root.right=b;
    Node c = new Node(6);
    Node d = new Node(5);
    a.left=c;
    a.right=d;
    Node e = new Node(11);
    b.right=e;
    Node f=new Node(100);
    e.left=f;
    // display(root);
    // System.out.println(size(root));
    // System.out.println(sum(root));
    
    // System.out.println(max(root));
    // System.out.println(height(root));
    // System.out.println(minimum(root));
    System.out.println(product(root));


  }
}