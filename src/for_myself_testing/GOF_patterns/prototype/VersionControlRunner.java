package for_myself_testing.GOF_patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProj123ect", "SourseCode sourceCode = new SourseCode();\n");
        System.out.println(master);
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.clonaProject();
        System.out.println(masterClone);
    }

}
