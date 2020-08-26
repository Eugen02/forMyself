package for_myself_testing.GOF_patterns.abstractFactory.banking;

import for_myself_testing.GOF_patterns.abstractFactory.Developer;

public class BankingDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Banking Developer writes code");
    }
}
