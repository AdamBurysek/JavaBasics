package Types;

import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyFormat = currency.format(12345678.923);

        System.out.println(currencyFormat);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentFormat = percent.format(0.1);

        System.out.println(percentFormat);
    }
}
