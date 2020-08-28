package for_myself_testing.GOF_patterns.chainOfResponsobility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifing using simple reort");
    }
}
