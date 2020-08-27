package for_myself_testing.GOF_patterns.bridge;

public class StockExcange extends Program {
    protected StockExcange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock System in progress...");
        developer.writeCode();
    }
}
