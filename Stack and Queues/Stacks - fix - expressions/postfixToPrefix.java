import java.util.*;

public class postfixToPrefix {
  public static void main(String[] args) {

    String str="ABC/-AK/L-*";
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
        st.push(ch+val1+val2);
      }
    }

    System.out.println(st.peek());
  }
}
