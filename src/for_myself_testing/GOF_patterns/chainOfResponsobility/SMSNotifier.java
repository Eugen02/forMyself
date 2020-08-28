package for_myself_testing.GOF_patterns.chainOfResponsobility;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to Manager " + message);
    }
}
