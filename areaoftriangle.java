import java.util.*;

public class areaoftriangle {
    public static void main(String[] args) {
        int a, b, c;
        double s, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides if a triangle: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        s = ((a + b + c) / 2);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle is: " + area);
        scanner.close();
    }
}
