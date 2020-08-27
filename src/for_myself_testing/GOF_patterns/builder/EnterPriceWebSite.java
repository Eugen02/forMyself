package for_myself_testing.GOF_patterns.builder;

public class EnterPriceWebSite extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("EBAM");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.alis);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(1000);
    }
}
