package for_myself_testing.GOF_patterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecarator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String  makeCodeReview(){
        return  " Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
