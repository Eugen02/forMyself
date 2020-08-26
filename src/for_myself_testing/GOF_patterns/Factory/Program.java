package for_myself_testing.GOF_patterns.Factory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        while (true) {                                                              //NOSONAR
            Scanner sc = new Scanner(System.in);
            String forJob = sc.next();
            DeveloperFactory developerFactory = createProgramerMain(forJob);
            Developer developer = developerFactory.createDeveloper();

            developer.writeCode();
        }
    }

    static DeveloperFactory createProgramerMain(String special){

        if (special.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
        else if (special.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }
        else throw new RuntimeException();
    }

}
