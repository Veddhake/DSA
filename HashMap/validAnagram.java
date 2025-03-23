import java.util.*;

public class validAnagram {
  
  public static boolean isAnagram(String s1, String s2)
  {
    Map<Character,Integer> mp = new HashMap<>();
    if(s1.length()!=s2.length())
    {
      return false;
    }

    for(int i=0;i<s1.length();i++)
    {
      if(!mp.containsKey(s1.charAt(i)))
      {
        mp.put(s1.charAt(i),1);
      }
      else
      {
        mp.put(s1.charAt(i), mp.get(s1.charAt(i))+1);
      }
    }

    for(int i=0;i<s2.length();i++)
    {
      if(!mp.containsKey(s2.charAt(i)))
      {
        return false;
      }
      else if(mp.get(s2.charAt(i))==0)
      {
        return false;
      }
      else
      {
        mp.put(s2.charAt(i),mp.get(s2.charAt(i))-1);
      }
    }

    return true;

  }
  public static void main(String[] args) {
    System.out.println(isAnagram("lissten", "sileent"));
  }
}
