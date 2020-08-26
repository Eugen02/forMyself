package for_myself_testing.GOF_patterns.abstractFactory.WebS;

import for_myself_testing.GOF_patterns.abstractFactory.Developer;
import for_myself_testing.GOF_patterns.abstractFactory.Manager;
import for_myself_testing.GOF_patterns.abstractFactory.ProjectTeamFactory;
import for_myself_testing.GOF_patterns.abstractFactory.Tester;

public class WebSTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new WebSDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebSTester();
    }

    @Override
    public Manager getManager() {
        return new WebSManager();
    }
}
