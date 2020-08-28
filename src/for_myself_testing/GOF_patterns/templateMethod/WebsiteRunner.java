package for_myself_testing.GOF_patterns.templateMethod;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate1 = new WelcomePage();
        WebsiteTemplate websiteTemplate2 = new NewsPage();
        websiteTemplate1.showPage();

        System.out.println("--------------");

        websiteTemplate2.showPage();
    }
}
