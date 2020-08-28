package for_myself_testing.GOF_patterns.interpreter;

public class TerminaExpression implements Expression{
    private String data;

    public TerminaExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
