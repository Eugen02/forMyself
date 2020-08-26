package for_myself_testing.GOF_patterns.abstractFactory.banking;

import for_myself_testing.GOF_patterns.abstractFactory.Developer;
import for_myself_testing.GOF_patterns.abstractFactory.Manager;
import for_myself_testing.GOF_patterns.abstractFactory.ProjectTeamFactory;
import for_myself_testing.GOF_patterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new BankingDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankingTester();
    }

    @Override
    public Manager getManager() {
        return new BankingManager();
    }
}
