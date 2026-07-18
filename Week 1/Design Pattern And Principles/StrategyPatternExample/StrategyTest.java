public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext();


        paymentContext.setPaymentStrategy(
                new CreditCardPayment());

        paymentContext.executePayment(
                2500.00);


        System.out.println();


        paymentContext.setPaymentStrategy(
                new PayPalPayment());

        paymentContext.executePayment(
                1500.50);
    }
}