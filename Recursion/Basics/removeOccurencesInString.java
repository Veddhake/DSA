package Basics;

public class removeOccurencesInString {

  public static String remove(String s,int idx, char c)
  {
    if(idx==s.length())
    {
     
      return "";
    }
    
    String ax = remove(s,idx+1,c);

    char a=s.charAt(idx);
    if(s.charAt(idx)!=c)
    {
      return a+ax;
    }
    return ax;
    


  }
  public static void main(String[] args) {
    String s="asssa";
    
    System.out.println(remove(s,0,'a'));
  }
}
