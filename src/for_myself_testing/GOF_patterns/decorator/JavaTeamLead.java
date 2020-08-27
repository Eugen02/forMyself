package for_myself_testing.GOF_patterns.decorator;

public class JavaTeamLead extends DeveloperDecarator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return  "Send Week Report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
