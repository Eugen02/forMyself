package for_myself_testing.GOF_patterns.builder;

public class Director {
WebSiteBuilder webSiteBuilder;

    public void setWebSiteBuilder(WebSiteBuilder webSiteBuilder) {
        this.webSiteBuilder = webSiteBuilder;
    }

    public WebSite buildWebSite(){
        webSiteBuilder.createWebSite();

        webSiteBuilder.buildName();
        webSiteBuilder.buildCms();
        webSiteBuilder.buildPrice();

        WebSite webSite = webSiteBuilder.getWebSite();
        return webSite;
    }
}
