import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int size = sc.nextInt();
       System.out.println("Enter the array: ");
       int[] arr = new int[size];
       for(int i = 0; i < size;i++)
       {
        arr[i] = sc.nextInt();
       }
       arr = mergeSort(arr);
       System.out.println(Arrays.toString(arr));
       sc.close();
    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second)
    {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length)
        {
            
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else
            {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

        }
    }

