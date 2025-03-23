import java.util.*;

public class prefixToPostfix {
  public static void main(String[] args) {

    String str="-9/*+5346";
    Stack <String> st= new Stack<>();

    for(int i=str.length()-1;i>=0;i--)
    {
      char ch=str.charAt(i);
      int ascii=(int)ch;

      if(ascii>=48&&ascii<=57)
      {
        st.push(Character.toString(ch));
      }
      else
      {
        String val1=st.pop();
        String val2=st.pop();
        st.push(val1+val2+ch);
      }
    }

    System.out.println(st.peek());
  }
}
