import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The Factors are: ");
        factor(n);
        sc.close();
    }
    static void factor(int n)
    {
        for(int i = 1; i <= n;i++)
        {
            if(n % i == 0)
            {
                System.out.println(i + " ");
            }
            
        }
    }
}