
public class printElementsAtNthLevel {

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

  public static void printAtLevel(Node root,int n)
  {
    if(root==null)
    {
      return;
    }

    if(n==1)
    {
      System.out.println(root.val);
      return;                       // for optimization as no longer need to go below the required level
    }

    printAtLevel(root.left,n-1);
    printAtLevel(root.right,n-1);

  } 
  public static void main(String[] args) {
    Node root = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    root.left=a;
    root.right=b;
    Node c = new Node(4);
    Node d = new Node(5);
    a.left=c;
    a.right=d;
    Node e = new Node(6);

    Node f = new Node(7);
    b.left=e;
    b.right=f;
    printAtLevel(root, 3);
  }
}
