import static java.lang.Math.pow;

public class CreditPaymentService {

    public int calculate(int sum, int years, double percent) {
        // formula from: https://journal.tinkoff.ru/guide/credit-payment/
        double monthlyPercent = percent/12/100;
        double k1 = pow(1 + monthlyPercent, 12 * years);
        double koeff = (monthlyPercent * k1) / (k1 - 1);
        return (int) (sum * koeff);
    }
}
