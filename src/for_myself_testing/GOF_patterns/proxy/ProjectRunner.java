package for_myself_testing.GOF_patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/Eugen02/forMyself");

       project.run();
    }
}
