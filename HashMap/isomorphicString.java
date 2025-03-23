import java.util.*;

public class isomorphicString {

  public static boolean isIsomorphic(String s1, String s2)
  {
    Map<Character,Character>mp= new HashMap<>();

    for(int i=0;i<s1.length();i++)
    {
      if(!mp.containsKey(s1.charAt(i)))
      {
        if(mp.containsValue(s2.charAt(i)))
        {
            return false;
        }
      } 
      if(!mp.containsKey(s1.charAt(i)))
      {
        mp.put(s1.charAt(i),s2.charAt(i));
      }
      else
      {
        if(mp.get(s1.charAt(i))!=s2.charAt(i))
        {
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {

    System.out.println(isIsomorphic("aab", "xyx"));
    
  }
}
