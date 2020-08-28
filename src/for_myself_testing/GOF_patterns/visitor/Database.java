package for_myself_testing.GOF_patterns.visitor;

public class Database implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);

    }
}
