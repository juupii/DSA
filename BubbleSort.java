import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array: ");
       int size = sc.nextInt();
       System.out.println("Enter the array: ");
       int[] arr = new int[size];
       
       for(int i = 0; i < size ;i++)
       {
        arr[i] = sc.nextInt();
       }
       
       Search(arr);
       System.out.println("The Sorted array is " +Arrays.toString(arr));
       sc.close();
    }

    static void Search(int[] arr)
    {
        boolean swapped;
        for(int i = 0; i < arr.length; i++)
        {
            swapped = false;
            for(int j = 1 ; j < arr.length - 1; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
            if(!swapped){
                break;
            }
        }

    }
    }

