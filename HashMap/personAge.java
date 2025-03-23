import java.util.*;

public class personAge {
   
  static void HashMapMethods(){
    Map<String,Integer> mp = new HashMap<>();
    
    //adding elements
    mp.put("Akash",21);
    mp.put("yash",16);
    mp.put("Lav",17);


    System.out.println(mp.get("yash"));
    System.out.println(mp.remove("Akash", 21));
    mp.putIfAbsent("Ved", 20);
    System.out.println(mp.keySet());
    System.out.println(mp.values());
    System.out.println(mp.entrySet());

    for(String key : mp.keySet())
    {
      System.out.println("Age of " + key + " is " + mp.get(key));
    }

    for(Map.Entry<String,Integer> e : mp.entrySet())
    {
      System.out.println("Age of "+ e.getKey() +"is"+ e.getValue());
    }

  }


  public static void main(String[] args) {
    HashMapMethods();
  }
}
