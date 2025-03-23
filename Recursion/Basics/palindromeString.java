package Basics;

public class palindromeString {

  public static boolean palindrome(String s, int idx)
  {
    if(idx>s.length()/2)
    {
      return true;
    }

    if(s.charAt(idx)!=s.charAt(s.length()-1-idx))
    {
      return false;
    }

    boolean b=palindrome(s,idx+1);

    return b;
  }
  public static void main(String[] args) {
    String s="ar";
    System.out.println(palindrome(s,0 ));
  }
}
