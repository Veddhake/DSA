import java.util.*;

public class postfixToInfix {
  public static void main(String[] args) {

    String str="953+4*6/-";
    Stack <String> st= new Stack<>();

    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      int ascii=(int)ch;

      if(ascii>=48&&ascii<=57)
      {
        st.push(Character.toString(ch));
      }
      else
      {
        String val2=st.pop();
        String val1=st.pop();
        st.push("("+val1+ch+val2+")");
      }
    }

    System.out.println(st.peek());
  }
}
