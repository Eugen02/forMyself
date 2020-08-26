package for_myself_testing.GOF_patterns.abstractFactory.WebS;

import for_myself_testing.GOF_patterns.abstractFactory.Developer;

public class WebSDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("WebS writes code");
    }
}
