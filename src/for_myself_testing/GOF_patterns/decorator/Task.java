package for_myself_testing.GOF_patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
        developer = new SeniorJavaDeveloper(new JavaTeamLead(new JavaDeveloper()));
        System.out.println(developer.makeJob());

    }
}
