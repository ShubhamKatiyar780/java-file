import java.util.*;

public class sumofnaturalnumber {
    static int function(int n) {
        if (n == 0) 
            return 0;
            else {
                return (n+function(n-1));
            }
        }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int n = scan.nextInt();
        float k = function(n);
        System.out.println("The sum of " + n + " natural number is: " + k);
        scan.close();
    }    
    }