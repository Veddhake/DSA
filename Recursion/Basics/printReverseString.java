package Basics;

public class printReverseString {

  public static String rev(String s, int idx)
  {
    if(idx==s.length())
    {
      return "";
    }

    String a=rev(s,idx+1);
   
    a=a+s.charAt(idx);
    return a;
  }
  public static void main(String[] args) {
    String s="alphabet";
    System.out.println(rev(s,0));
  }
}
