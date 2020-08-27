package for_myself_testing.GOF_patterns.builder;

public class VisitCardWebSite extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit Card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WordPress);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(100);
    }
}
