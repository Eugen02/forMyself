package for_myself_testing.GOF_patterns.templateMethod;

public class NewsPage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
