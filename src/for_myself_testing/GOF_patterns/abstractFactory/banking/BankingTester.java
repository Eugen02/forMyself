package for_myself_testing.GOF_patterns.abstractFactory.banking;

import for_myself_testing.GOF_patterns.abstractFactory.Tester;

public class BankingTester implements Tester {
    @Override
    public void checkCode() {
        System.out.println("Banking tester will check code !");
    }
}
