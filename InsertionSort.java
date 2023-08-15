import java.util.*;
public class InsertionSort {
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
        Insertion(arr);
        System.out.println("The Sorted array is: "+Arrays.toString(arr));
        sc.close();   
    }
    static void Insertion(int[] arr)
    {
        for(int i = 0; i < arr.length-1;i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    Swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }

    }
    static void Swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
