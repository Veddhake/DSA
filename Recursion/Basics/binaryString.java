package Basics;
import java.util.*;

public class binaryString {

  public static void generate(String s,int idx,int len)
  {
    
    if(idx==len)
    {
       System.out.println(s+" ");
       return;
    }

    if(s=="")
    {      
      generate(s+'0',idx+1,len);
      generate(s+'1',idx+1,len);
    }

    else if(s.charAt(idx-1)=='1')
    {
      generate(s+'0',idx+1,len);
    }
    else if(s.charAt(idx-1)=='0')
    {
      generate(s+'0',idx+1,len);
      generate(s+'1',idx+1,len);
    }

    return ;

  }

  public static List<String> generateParenthesis(int n) {

    List<String> list= new ArrayList<String>();
    generate(list,"",n,0,0,0);
    return list;


    
}

public static void generate (List<String> list, String s, int len, int open, int close, int idx)
{
    if(idx==len*2)
    {
      System.out.println(s);
        list.add(s);
        return;
    }

    if(s=="")
    {
        generate(list,s+'(',len,open+1,close,idx+1);
    }
    else
    {
      if(open<len)
      {
          generate(list,s+'(',len,open+1,close,idx+1);

      }
      if(close<open)
      {
          generate(list,s+')',len,open,close+1,idx+1);
      }
    }

    
}

public static HashSet<String> print(String n, String s, int idx)
{
    if(idx==s.length())
    { HashSet<String> h= new HashSet<String>();
      h.add(n);
      return h;
    }

    HashSet<String> h= new HashSet<String>();
    char c=s.charAt(idx);
    h.addAll(print(n+c,s,idx+1));
    h.addAll(print(n,s,idx+1));

    return h;
}

public  static void combination(List<Integer> l,int[]candidates, int target, int idx,List<List<Integer>> list)
{

  if(target==0)
    {
        list.add(new ArrayList<>(l));
        return;
    }

    if(target<0 )
    {
        return ;
    }

    for(int i=idx;i<candidates.length;i++)
    {
      l.add(candidates[i]);
      combination(l,candidates,target-candidates[i],i+1,list);
      l.remove(l.size()-1);
    }




}

public static int count(int[]nums, int target, int count, int idx, int sum)
{
    if(idx==nums.length)
    {
        if(sum==target)
        {
            count++;
        }
        return count;
    }
    
    int x=count(nums,target,count,idx+1,sum+nums[idx]);
    int y=count(nums,target,count,idx+1,sum);
    return x+y;

    
    
}

public static  void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {

  System.out.print (current);
  System.out.println (" " + start + " " + target);

  if(target==0) 
  {
      result.add(new ArrayList<>(current));
      return;
  }
  
  if(target<0) 
  {
      return;
  }
  
  for(int i=start; i<candidates.length; i++) 
  {
      current.add(candidates[i]);
      backtrack(candidates, target-candidates[i], i, current, result);
      System.out.println ("**** " + i);
      current.remove(current.size()-1); 
  }
}
  public static void main(String[] args) {
    // HashSet<String> h=new HashSet<String>();
    // int arr[] = {5, 2, 3, 10, 6, 8};
    // generate("",0,3);
    // generateParenthesis(1);
    // System.out.println(print("","abb",0));
    // System.out.println(count(arr,10,0,0,0));
    int nums[]={1,2,3,4,5,6,7,1,2,3,4,5};
    List<Integer> l= new ArrayList<Integer>();
    List<List<Integer>> list= new ArrayList<List<Integer>>();
    combination(l, nums, 7, 0, list);
    System.out.println(list);

    // List<List<Integer>> result=new ArrayList<>();
    // backtrack(nums, 7, 0, new ArrayList<>(), result);
       
  }
  
}
