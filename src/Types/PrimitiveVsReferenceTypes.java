package Types;

import java.awt.*;
import java.util.Date;

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {
        /* Primitive types have different memory location */
        byte x = 1;
        byte y = x;

        x = 2;

        System.out.println(y);

        /* Reference types have same memory location */
        Point point1 = new Point(1,1);
        Point point2 = point1;

        point1.x = 2;

        System.out.println(point2);
;    }
}
