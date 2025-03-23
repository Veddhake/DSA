package Basics;

import java.util.*;
public class searchInArray {

  public static boolean exists(int[]arr,int idx,int n)
  {
    if(idx==arr.length)
    {
      return false;
    }
    
    if(arr[idx]==n)
    {
      
      return true;
    }
    return exists(arr,idx+1,n);
  }

  public static int findIndex(int[]arr,int idx,int n)
  {
    if(idx==arr.length)
    {
      return -1;
    }

    if(arr[idx]==n)
    {
      return idx;
    }

    return findIndex(arr,idx+1,n);
  }

  public static ArrayList<Integer> findIndices(int[]arr,int idx,int n)
  {
    if(idx==arr.length)
    {
      ArrayList<Integer> a=new ArrayList<Integer>();
      return a;
    }

    ArrayList<Integer> a=new ArrayList<Integer>();


    if(arr[idx]==n)
    {
      a.add(idx);
    }
    ArrayList<Integer> a2=findIndices(arr,idx+1,n);
    a.addAll(a2);
    return a;
    
  }

  public static void main(String[] args) {
    int arr[]={5,7,3,9,2,3,3,3,3,12};
    System.out.println(exists(arr,0,3));
    System.out.println(findIndices(arr,0,3));
  

  }
  
}
