package for_myself_testing.GOF_patterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer knows Java Core" + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE" + isJavaEE.interpret("Java Spring"));

    }

    public static  Expression getJavaExpression(){
        Expression java = new TerminaExpression("Java");
        Expression javaCore = new TerminaExpression("Java Core");
        return new OrExpression(java,javaCore);
    }
    public static  Expression getJavaEEExpression(){
        Expression java = new TerminaExpression("Java");
        Expression spring = new TerminaExpression("Spring");
        return new AndExpression(java,spring);
    }
}
