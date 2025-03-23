import java.util.*;

public class prefix {
  public static void main(String[] args) {

    String str="-9/*+5346";
    Stack<Integer> st= new Stack<>();

    for(int i=str.length()-1;i>=0;i--)
    {
      char ch=str.charAt(i);
      int ascii=(int)ch;

      if(ascii>=48&&ascii<=57)
      {
        st.push(ascii-48);
      }
      else
      {
        int val1=st.pop();      //note the difference in val1 and val2 in other fix expressions and this one since the for loop is reevrsed, the values are also swapped
        int val2=st.pop();
        if(ch=='+')
        {
          st.push(val1+val2);
        }
        if(ch=='-')
        {
          st.push(val1-val2);
        }
        if(ch=='*')
        {
          st.push(val1*val2);
        }
        if(ch=='/')
        {
          st.push(val1/val2);
        }
      }
    }

    System.out.println(st.peek());
  }
}
