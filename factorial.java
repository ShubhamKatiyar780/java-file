import java.util.*;

public class factorial {
    static int fun(int n) {
        if (n == 0) 
            return 1;
        else{
            return (n*fun(n-1));
        }
    }
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int k = fun(n);
        System.out.println("The Factorial of "+n+" is: "+k);
        scanner.close();

        // factorial ff = new factorial();
        // int res = ff.fun(n);
        // System.out.println(res);
    }
}

