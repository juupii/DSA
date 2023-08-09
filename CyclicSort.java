//Cyclic sort is used for numbers range  from 1 to n.
import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
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
        Cyclic(arr);
        System.out.println("The Sorted array is: "+Arrays.toString(arr));
        sc.close();   
    }
    static void Cyclic(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                Swap(arr,i,correct);
            }
            else
            {
                i++;
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

