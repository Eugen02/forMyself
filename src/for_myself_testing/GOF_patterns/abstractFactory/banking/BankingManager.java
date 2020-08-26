package for_myself_testing.GOF_patterns.abstractFactory.banking;

import for_myself_testing.GOF_patterns.abstractFactory.Manager;

public class BankingManager implements Manager {
    @Override
    public void checkTeamWork() {
        System.out.println("Banking manager try count the money");
    }
}
