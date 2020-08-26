package for_myself_testing.GOF_patterns.abstractFactory.WebS;

import for_myself_testing.GOF_patterns.abstractFactory.Manager;

public class WebSManager implements Manager {
    @Override
    public void checkTeamWork() {
        System.out.println("WebS check teamF(W)ork");
    }
}
