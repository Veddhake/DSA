package Basics;

public class frogJump {


  public static int minCost(int[]arr,int len,int idx){

    int lcost;
    int rcost;
    if(idx==arr.length-1)
    {
      return 0;
    }
    
    lcost=Math.abs(arr[idx]-arr[idx+1])+minCost(arr,len,idx+1);
    
    if(idx==arr.length-2)
    {
      return lcost;
    }
    
    rcost=Math.abs(arr[idx]-arr[idx+2])+minCost(arr,len,idx+2);
    

    return Math.min(lcost,rcost);

  }
  public static void main(String[] args) {
    int arr[]={10,30,40,20};
    System.out.println(minCost(arr,arr.length,0));
  }
  
}
