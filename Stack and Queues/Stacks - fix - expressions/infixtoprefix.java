import java.util.*;

public class infixtoprefix {
  public static void main(String[] args) {
    String str="9-(5+3)*4/6";

    Stack<String> val= new Stack<>();
    Stack<Character> op=new Stack<>();

    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      int ascii=(int)ch;

      if(ascii>=48 && ascii<=57)
      {
        val.push(Character.toString(ch));
      }
      else if(op.size()==0 || ch=='(' || op.peek()=='(')
      {
        op.push(ch);
      }
      else
      {
        if(ch=='+'||ch=='-')
        {
          while(op.size()!=0)
          {
            String s2=val.pop();
            String s1=val.pop();
            val.push(op.peek()+s1+s2);
            op.pop();
          }
          op.push(ch);
        }
        else if(ch=='*'||ch=='/')
        {
          if(op.peek()=='*'||op.peek()=='/')
          {
            String s2=val.pop();
            String s1 = val.pop();
            val.push(op.peek()+s1+s2);
            op.pop();
            op.push(ch);
          }
          else
          {
            op.push(ch);
          }
        }
        else if(ch==')')
        {
          while(op.peek()!='(')
          {
            String s2=val.pop();
            String s1=val.pop();
            val.push(op.peek()+s1+s2);
            op.pop();
          }
          op.pop();
        }
      }
    }

    while(op.size()>0)
    {
            String s2=val.pop();
            String s1 = val.pop();
            val.push(op.peek()+s1+s2);
            op.pop();
    }

    System.out.println(val.peek());
  }
}
