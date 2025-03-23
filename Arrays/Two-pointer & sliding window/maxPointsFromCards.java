public class maxPointsFromCards {

  public static int maxScore(int[]arr, int k)
  {
    int sum=0;
    int max=0;
    int start=arr.length-k;
    for(int i=start;i<arr.length;i++)
    {
      sum+=arr[i];
    }
    max=sum;
    int end=arr.length-1;
    int c=0;
    
    
    for(int i=1;i<=k;i++)
    {
      sum=sum-arr[start%arr.length];
      sum=sum+arr[(end+1)%arr.length];
      start++;
      end++;
      max=Math.max(sum,max);
    }
    return max;
  }
  public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,1};
    System.out.println(maxScore(arr,3));
  }
}
