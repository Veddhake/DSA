import java.util.*;

public class implementation
{

  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
      this.data=data;
    }
  }

  public static Node insert(Node root, int val)
  {
    if(root==null)
    {
      root=new Node(val);
      return root;
    }

    if(val<root.data)
    {
      root.left=insert(root.left,val);
    }
    else{
      root.right=insert(root.right,val);
    }
    return root;

  }

  public static void inorder(Node root)
  {
    if(root==null)
    {
      return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }

  public static boolean search(Node root,int val)
  {
    if(root==null)
    {
      return false;
    }
    else if(val<root.data)
    {
      search(root.left,val);
    }
    else if(val>root.data)
    {
      search(root.right,val);
    }
    else
    {
      return true;
    }
    return false;
  }
  
  public static Node delete(Node root,int val)
  {
    if(root.data>val)
    {
      root.left=delete(root.left,val);
    }
    else if(root.data<val)
    {
      root.right=delete(root.right,val);
    }
    else
    {
      if(root.left==null&&root.right==null)
      {
        return null;
      }
      if(root.left==null)
      {
        return root.right;
      }
      else if(root.right==null)
      {
        return root.left;
      }

      Node IS=inorderSuccessor(root.right);
      root.data=IS.data;
      root.right=delete(root.right,IS.data);
    }
    return root;
  }

  public static Node inorderSuccessor(Node root)
  {
    while(root.left!=null)
    {
      root=root.left;
    }

    return root;
  }

  public static void printInRange(Node root, int min,int max)
  {
    if(root==null)
    {
      return;
    }
    if(root.data>=min && root.data<=max)
    {
      printInRange(root.left,min,max);
      System.out.println(root.data);
      printInRange(root.right,min,max);
    }
    else if(root.data<min)
    {
      printInRange(root.right,min,max);
    }
    else if(root.data>max)
    {
      printInRange(root.left,min,max);
    }
  }

  public static void paths(Node root,List<Integer> sl,List<List<Integer>>bl)
  {
    if(root==null)
    {
      return;
    }
    

    if(root.left==null&&root.right==null)
    {
      sl.add(root.data);
      List<Integer> temp= new ArrayList<>();
      for(int i=0;i<sl.size();i++)
      {
        temp.add(sl.get(i));
      }
      bl.add(temp);
      sl.remove(sl.size()-1);
    }
    sl.add(root.data);
    paths(root.left,sl,bl);
    paths(root.right,sl,bl);
    sl.remove(sl.size()-1);
    
  }
  public static void main(String[] args) {
    int[]values={5,1,3,4,2,7};
    Node root=null;
    for(int i=0;i<values.length;i++)
    {
      root=insert(root,values[i]);
    }
    // inorder(root);
    // System.out.println(search(root,10));
    // printInRange(root, 2,5);
    List<Integer>sl=new ArrayList<>();
    List<List<Integer>>bl=new ArrayList<>();
    paths(root,sl,bl);
    System.out.println(bl);
  }
}