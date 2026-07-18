public class AdapterTest {


    public static void main(String[] args) {



        PaymentProcessor paypal =
                new PayPalAdapter(
                    new PayPalGateway()
                );


        paypal.processPayment(500);



        System.out.println();




        PaymentProcessor stripe =
                new StripeAdapter(
                    new StripeGateway()
                );


        stripe.processPayment(1000);

    }
}