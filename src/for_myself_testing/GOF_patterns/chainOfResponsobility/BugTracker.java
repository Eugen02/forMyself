package for_myself_testing.GOF_patterns.chainOfResponsobility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier notifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier notifier1 = new EmailNotifier(Priority.IMPORTANT);
        Notifier notifier2 = new SMSNotifier(Priority.ASAP);

        notifier.setNextNotifier(notifier1);
        notifier1.setNextNotifier(notifier2);

        notifier.NotifyManager("OK", Priority.ROUTINE);
        notifier.NotifyManager(" not OK", Priority.IMPORTANT);
        notifier.NotifyManager("really bad", Priority.ASAP);
    }
}
