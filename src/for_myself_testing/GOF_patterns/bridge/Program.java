package for_myself_testing.GOF_patterns.bridge;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }

    public abstract void  developProgram();

}
