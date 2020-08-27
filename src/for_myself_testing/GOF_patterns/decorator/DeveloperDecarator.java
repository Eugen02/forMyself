package for_myself_testing.GOF_patterns.decorator;

public class DeveloperDecarator implements  Developer{
Developer developer;

    public DeveloperDecarator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
