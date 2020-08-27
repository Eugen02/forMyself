package for_myself_testing.GOF_patterns.builder;

public class StartDirector {
    public static void main(String[] args) {
     Director director = new Director();

     director.setWebSiteBuilder(new VisitCardWebSite());
     WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
