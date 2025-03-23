import java.util.*;

public class balancedBrackets
{

  public static boolean check(String s)
  {
    int idx=0;
    Stack<Character> st = new Stack<>();

    while(idx!=s.length())
    {
      if(s.charAt(idx)=='(')
      {
        st.push(s.charAt(idx));
      }
      else if(s.charAt(idx)==')' && st.size()!=0)
      {
        st.pop();
      }
      else
      {
        return false;
      }
      idx++;
    }

    if(st.size()==0)
    {
      return true;
    }
    else return false;
  }
  public static void main(String[] args) {
    System.out.println(check("()()())"));
    
  }
}