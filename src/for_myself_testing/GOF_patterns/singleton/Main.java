package for_myself_testing.GOF_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogFile("1");
        ProgramLogger.getProgramLogger().addLogFile("2");
        ProgramLogger.getProgramLogger().addLogFile("3");
        ProgramLogger.getProgramLogger().addLogFile("4");

        ProgramLogger.getProgramLogger().getLog();
    }
}
