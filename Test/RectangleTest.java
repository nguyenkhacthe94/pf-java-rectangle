import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {



    @Test
    @DisplayName("Width 4, height 40")
    void getAreaInteger() {
        double width = 4;
        double height = 40;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 160;
        double result = rectangle.getArea();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Width 3.5, height 35.9")
    void getAreaDouble() {
        double width = 3.5;
        double height = 35.9;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 3.5*35.9;
        double result = rectangle.getArea();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Int Perimeter")
    void getPerimeter() {
        double width = 4;
        double height = 40;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 88;
        double result = rectangle.getPerimeter();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Double Perimeter")
    void getPerimeterDouble() {
        double width = 3.5;
        double height = 35.9;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 78.8;
        double result = rectangle.getPerimeter();
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Display integer")
    void displayInteger() {
        double width = 4;
        double height = 40;
        Rectangle rectangle = new Rectangle(width, height);
        String expected = "Rectangle{width=4.0, height=40.0}";
        String result = rectangle.display();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Display double")
    void displayDouble() {
        double width = 3.5;
        double height = 35.9;
        Rectangle rectangle = new Rectangle(width, height);
        String expected = "Rectangle{width=3.5, height=35.9}";
        String result = rectangle.display();
        assertEquals(expected, result);
    }
}