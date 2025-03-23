import java.util.*;

public class longestNonRepeatingString {
  
  public static int longest(String s)
  {
    Map<Character,Integer> mp = new HashMap<>();
   
    int max=0;
    int start=0;
    
    for(int i=0;i<s.length();i++)
    {
      if(!mp.containsKey(s.charAt(i)))
      {
       
        mp.put(s.charAt(i),i);
      }
      else
      {
        if(mp.get(s.charAt(i))>=start)
        {
          start=mp.get(s.charAt(i))+1;
        }
        mp.put(s.charAt(i),i);
      }
      max = Math.max(max, i - start + 1);
    }
   
    return max;
  }
  
  public static void main(String[] args) {
    System.out.println(longest("abcabcbb"));
    
  }
}
