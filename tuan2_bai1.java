import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        
        String result = triangleType(a, b, c);
        System.out.println("Loai tam giac: " + result);
    }
    
    public static String triangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "NotATriangle";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else if (a != b && b != c && a != c) {
            return "Scalene";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            return "RightTriangle";
        } else {
            return "NotATriangle";
        }
    }
}