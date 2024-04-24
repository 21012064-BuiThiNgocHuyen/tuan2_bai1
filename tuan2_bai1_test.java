import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTypeTest {
    
    @Test
    public void testEquilateralTriangle() {
        String result = TriangleType.triangleType(3, 3, 3);
        Assertions.assertEquals("Equilateral", result);
    }
    
    @Test
    public void testIsoscelesTriangle() {
        String result = TriangleType.triangleType(4, 4, 5);
        Assertions.assertEquals("Isosceles", result);
    }
    
    @Test
    public void testScaleneTriangle() {
        String result = TriangleType.triangleType(5, 7, 9);
        Assertions.assertEquals("Scalene", result);
    }
    
    @Test
    public void testRightTriangle() {
        String result = TriangleType.triangleType(3, 4, 5);
        Assertions.assertEquals("RightTriangle", result);
    }
    
    @Test
    public void testNotATriangle() {
        String result = TriangleType.triangleType(-1, 2, 3);
        Assertions.assertEquals("NotATriangle", result);
    }
}