package for_myself_testing.GOF_patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file +\n";


    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogFile(String s){
        logFile += s + '\n';
    }

    public void getLog(){
        System.out.println(logFile);
    }

    public ProgramLogger() {
    }
}
