package for_myself_testing.GOF_patterns.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExcange(new CppDeveloper())
        };
        for (Program program : programs){
            program.developProgram();
        }
    }
}
