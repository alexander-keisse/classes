package graphics;

import static graphics.Rectangle.*;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle(-12, -14);

        rect.setX(11);
        rect.setY(48);

        System.out.println("Rectangle width is: " + rect.getWidth());
        System.out.println("Rectangle height is: " + rect.getHeight());
        System.out.printf("Position: (%d, %d)", rect.getX(), rect.getY());
        System.out.println();

        System.out.println("The area is: " + rect.getArea());
        System.out.println("The perimeter is: " + rect.getPerimeter());

        System.out.println("Number of rectangles created: " + getCount());

        System.out.println("\n\nSecond Rectangle\n");
        Rectangle rect2 = new Rectangle(99, 55);

        rect2.setPosition(33, 87);

        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.printf("Position: (%d, %d)", rect2.getX(), rect2.getY());
        System.out.println();

        System.out.println("The area is: " + rect2.getArea());
        System.out.println("The perimeter is: " + rect2.getPerimeter());
        System.out.println();
        System.out.println("Number of rectangles created: " + Rectangle.getCount());

        Rectangle rect3 = new Rectangle();

        System.out.println("Height: " + rect3.getHeight());
        System.out.println("Width: " + rect3.getWidth());
        System.out.printf("Position: (%d, %d)", rect3.getX(), rect3.getY());
        System.out.println();

        System.out.println("The area is: " + rect3.getArea());
        System.out.println("The perimeter is: " + rect3.getPerimeter());
        System.out.println("Number of rectangles created: " + Rectangle.getCount());
        System.out.println();

        Rectangle rect4 = new Rectangle(14, 55, 87, 99);
        System.out.println("Number of rectangles created: " + Rectangle.getCount());

        Rectangle rect5 = new Rectangle(rect4);

        System.out.println("Height: " + rect5.getHeight());
        System.out.println("Width: " + rect5.getWidth());
        System.out.printf("Position: (%d, %d)", rect5.getX(), rect5.getY());
        System.out.println();

        System.out.println("The area is: " + rect5.getArea());
        System.out.println("The perimeter is: " + rect5.getPerimeter());
        System.out.println();

        System.out.println("A rectangle has: " + Rectangle.ANGLES + " angles.");
        System.out.println("Number of rectangles created: " + Rectangle.getCount());
    }
}
