import java.util.*;
public class BinarySearch{
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
       System.out.println("Enter the element to be searched: ");
       int target = sc.nextInt();
       
       int result = binarySearch(arr,target);
       if(result == -1)
       {
        System.out.println("NOT FOUND");
       }
       else {
       System.out.println("Result found at index: "+result);
       }
       sc.close();
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}