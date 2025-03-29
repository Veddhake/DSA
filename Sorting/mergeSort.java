package Sorting;

public class mergeSort {
  
  public static void merge(int[]arr, int start, int mid, int end)
  {
    int n1=mid-start+1;
    int n2=end-mid;

    int[]left = new int[n1];
    int[]right = new int[n2];

    for(int i=0;i<n1;i++)
    {
      left[i]=arr[start+i];
    }

    for(int i=0;i<n2;i++)
    {
      right[i]=arr[mid+i+1];
    }

    int i=0;
    int j=0;
    int x=start;

    while(i<n1 && j<n2)
    {
      if(left[i]<right[j])
      {
        arr[x]=left[i];
        i++;
      }
      else if(left[i]>=right[j])
      {
        arr[x]=right[j];
        j++;
      }
      x++;
    }

    while(i<n1)
    {
      arr[x]=left[i];
      i++;
      x++;
    }

    while(j<n2)
    {
      arr[x]=right[j];
      j++;
      x++;
    }

    return;
  }


  public static void divide(int [] arr, int start, int end)
  {
    if(start>=end)
    {
      return;
    }

    int mid = (start+end)/2;
    divide(arr,start,mid);
    divide(arr,mid+1,end);
    merge(arr,start,mid,end);
  }
  public static void main(String[] args)
  {
    int[] arr ={6,4,3,7,1,2,9,5};
    divide(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
