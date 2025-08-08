package Types;

public class MathClass {
    public static void main(String[] args) {
        int resultRound = Math.round(1.1F);
        int resultCeil = (int) Math.ceil(1.1F);
        int resultFloor = (int) Math.floor(1.1F);
        int resultMax = Math.max(1, 2);
        double resultRandom = Math.random();
        int resultRandom100 = (int) Math.round(Math.random() * 100);

        System.out.println(resultRound);
        System.out.println(resultCeil);
        System.out.println(resultFloor);
        System.out.println(resultMax);
        System.out.println(resultRandom);
        System.out.println(resultRandom100);
    }
}
