package for_myself_testing.GOF_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String,Developer> developers = new HashMap<>();
    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiting Java Developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring Cpp Developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
            return developer;

    }

}
