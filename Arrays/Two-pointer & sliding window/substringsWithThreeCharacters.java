public class substringsWithThreeCharacters {
  
  public static int subcount(String s)
  {
    int ca=0;
    int cb=0;
    int cc=0;
    int count=0;
    int start=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='a')
      {
        ca++;
      }
      if(s.charAt(i)=='b')
      {
        cb++;
      }
      if(s.charAt(i)=='c')
      {
        cc++;
      }
      
      if(ca>0 && cb>0 &&cc>0)
      {
        
        count+=s.length()-i;
        System.out.println(count);
      }

      while(ca>0&&cb>0&&cc>0)
      {
        if(s.charAt(start)=='a')
        {
          ca--;
          start++;
        }
        else if(s.charAt(start)=='b')
        {
          cb--;
          start++;
        }
        else if(s.charAt(start)=='c')
        {
          cc--;
          start++;
        }
        if(ca>0&&cb>0&&cc>0)
        {
        count+=s.length()-i;
        }
        System.out.println("h"+ count);
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    System.out.println(subcount("abcbac"));
  }
}
