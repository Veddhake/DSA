import java.util.*;

public class infixtopostfix {
  public static void main(String[] args) {
    String str="a+b*(c^d-e)^(f+g*h)-i";

    Stack<String> val= new Stack<>();
    Stack<Character> op=new Stack<>();

    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
     

      if(Character.isLetterOrDigit(ch))
      {
        val.push(Character.toString(ch));
      }
      else if((op.size()==0 || ch=='(' || op.peek()=='(' )&& ch!=')')
      {
        op.push(ch);
      }
      else
      {
        if(ch=='+'||ch=='-')
        {
          while(op.size()!=0 && op.peek()!='(')
          {
            String s2=val.pop();
            String s1=val.pop();
            val.push(s1+s2+op.peek());
            op.pop();
          }
          op.push(ch);
        }
        else if(ch=='*'||ch=='/')
        {
          if(op.peek()=='*'||op.peek()=='/' || op.peek()=='^')
          {
            while(op.size()!=0 && op.peek()!='+' &&op.peek()!='-' && op.peek()!='(')
            {
              String s2=val.pop();
              String s1 = val.pop();
              val.push(s1+s2+op.peek());
              op.pop();
            }
            op.push(ch);
          }
          else
          {
            op.push(ch);
          }
        }
        else if(ch=='^')
        {
          if(op.peek()=='^')
          {
            String s2=val.pop();
            String s1 = val.pop();
            val.push(s1+s2+op.peek());
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
            val.push(s1+s2+op.peek());
            op.pop();
          }
          op.pop();
        }
      }
    }
    System.out.println(op);
    while(op.size()>0)
    {
            String s2=val.pop();
            String s1 = val.pop();
            val.push(s1+s2+op.peek());
            op.pop();
    }

    System.out.println(val.peek());
  }
}

