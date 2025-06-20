public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        System.out.println("--- Using Credit Card ---");
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.processPayment(150.00);

        System.out.println("\n--- Using PayPal ---");
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.processPayment(85.50);
    }
}