package for_myself_testing.GOF_patterns.chainOfResponsobility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email " + message);
    }
}
