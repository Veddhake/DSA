public class niceSubarrays {

  public static int nice(int[] arr, int k)
  {
    return help(arr,k)-help(arr,k-1);
  }

  public static int help(int []arr, int k)
  {
    int res=0;
    int start=0;
    int count=0;
    if(k<0)
    {
      return 0;
    }
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==1)
      {
        count++;
      }
      if(count>k)
      {
        while(arr[start]%2!=1)
        {
          System.out.print(start + " ");
          start++;
        }
        count--;
        start++;
      }
      System.out.println();
      res+=i-start+1;
    }
    return res;
  }
  public static void main(String[] args) {
    int[]arr={2,2,2,1,2,2,1,2,2,2};

    System.out.println(nice(arr,2));
  }
}
