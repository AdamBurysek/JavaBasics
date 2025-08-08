package Types;

public class Casting {
    public static void main(String[] args) {
        /* Implicit casting */
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;


        double a = 1.1;
        /* Explicit casting */
        int b = (int)a + 2;

        String c = "1";
        int d = Integer.parseInt(c) + 2;

        String e = "1.1";
        double f = Double.parseDouble(e) + 2;

        System.out.println(y);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
    }
}
