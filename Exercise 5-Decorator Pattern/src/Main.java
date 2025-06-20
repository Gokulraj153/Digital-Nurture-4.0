public class Main {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        Notifier emailAndSMS = new SMSNotifierDecorator(email);
        Notifier allNotifications = new SlackNotifierDecorator(emailAndSMS);
        System.out.println("---- Sending Notifications ----");
        allNotifications.send("System Alert: Server Down!");
    }
}