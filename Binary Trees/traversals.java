
public class traversals {
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

  public static void preorder(Node root) //root -> left -> right
  {
    if(root==null)
    {
      return;
    }
    System.out.println(root.val); //root
    preorder(root.left);          //left
    preorder(root.right);         //right
  }

  public static void inorder(Node root) //left -> root -> right
  {
    if(root==null)
    {
      return;
    }
    inorder(root.left);          //left
    System.out.println(root.val); //root
    inorder(root.right);         //right
  }

  public static void postorder(Node root) //left -> right -> root
  {
    if(root==null)
    {
      return;
    }
    postorder(root.left);          //left
    postorder(root.right);         //right
    System.out.println(root.val); //root

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
    postorder(root);
  


  }
}
