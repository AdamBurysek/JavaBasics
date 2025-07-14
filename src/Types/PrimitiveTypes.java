package Types;

public class PrimitiveTypes {
    public static void main(String[] args) {
/*      Data Type      Size (bits)    Size (bytes)    Value Range
        byte           8 bits         1 byte          -128 to 127
        short          16 bits        2 bytes         -32,768 to 32,767
        int            32 bits        4 bytes         -2,147,483,648 to 2,147,483,647
        long           64 bits        8 bytes         -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float          32 bits        4 bytes         Approximately ±3.4E38 (7 digits of precision)
        double         64 bits        8 bytes         Approximately ±1.8E308 (15 digits of precision)
        char           16 bits        2 bytes         0 to 65,535 (Unicode characters)
        boolean        depends on JVM not specified   true or false  */


        byte age = 30;
        /* it's possible to use underscores for better reading */
        int viewsCount = 123_456_789;

        /* ending L telling it's not ing, but long - default sees int */
        long bigViewsCount = 3_123_456_789L;

        /* default sees long */
        float price = 10.99F;

        /* by convection ' is for char and " is for string */
        char letter = 'A';

        boolean isEligible = true;

        System.out.println(bigViewsCount);
    }
}
