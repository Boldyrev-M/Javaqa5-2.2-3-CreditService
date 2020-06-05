public class Main {
    public static void main(String[] args) {
        int creditSum = 1_000_000; // roubles
        double percent = 9.99;
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.calculate(creditSum, 1, percent));
        System.out.println(service.calculate(creditSum, 2, percent));
        System.out.println(service.calculate(creditSum, 3, percent));
    }
}
