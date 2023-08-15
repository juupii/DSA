//fibo(n) = fibo(n-1) + fibo(n-2);
//fibo(n-1) = fibo(n-2) + fibo(n-3);
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
//       int ans = fibo(6);
//       System.out.println(ans);
        
//     }
//     static int fibo(int n)
//     {
//         if(n < 2)
//         {
//             return n;
//         }
//         return fibo(n-1) + fibo(n-2);
//     }
// }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number whose fibonnaci you want to see: ");
    int num = sc.nextInt();
    for(int i = 0; i < num; i++)
    {
        System.out.println(fibo(i) + " ");
    }
    System.out.println("The sum upto" +num+ "is: "+fibo(num));
   //6
// System.out.println(ans);
   sc.close();

    }
    static int fibo(int count)
    {
        
        if(count == 0 )
        {
            return 0;
        }
        if(count == 1 || count == 2)
        {
            return 1;

        }
        return fibo(count-1) + fibo(count-2);
    }
}