package Basics;

public class subsequencesOfArray {


  public static void printSub(String s, String current)
  {
    //base case
    if(s.length()==0)
    {
      System.out.println(current);
      return;
    }

    char curr=s.charAt(0);
    String remaining=s.substring(1);
    printSub(remaining,current+curr);
    printSub(remaining,current);
  }
  public static void main(String[] args) {
    printSub("ved","");
  }
  
}
