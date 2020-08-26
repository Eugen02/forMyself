package for_myself_testing.GOF_patterns.abstractFactory;

import for_myself_testing.GOF_patterns.abstractFactory.WebS.WebSTeamFactory;
import for_myself_testing.GOF_patterns.abstractFactory.banking.BankingTeamFactory;

public class Proces {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        developer.writeCode();
        tester.checkCode();
        manager.checkTeamWork();
    }
}
