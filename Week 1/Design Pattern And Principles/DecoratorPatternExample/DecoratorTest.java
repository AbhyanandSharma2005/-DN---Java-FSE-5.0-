public class DecoratorTest {


    public static void main(String[] args) {


        // Only Email Notification

        Notifier emailNotifier =
                new EmailNotifier();


        emailNotifier.send(
                "Server is running"
        );


        System.out.println();



        // Email + SMS

        Notifier emailSMSNotifier =
                new SMSNotifierDecorator(
                        new EmailNotifier()
                );


        emailSMSNotifier.send(
                "New login detected"
        );


        System.out.println();



        // Email + SMS + Slack

        Notifier allNotifier =
                new SlackNotifierDecorator(
                    new SMSNotifierDecorator(
                        new EmailNotifier()
                    )
                );


        allNotifier.send(
                "Critical security alert"
        );

    }
}