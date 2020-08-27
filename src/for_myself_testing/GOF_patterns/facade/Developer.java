package for_myself_testing.GOF_patterns.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solvng problems");
        }  else {
                System.out.println("Developer reeding habr");
            }
    }
}
