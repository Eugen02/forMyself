package for_myself_testing.GOF_patterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();
        javaDeveloperJobSite.addVacancy("First Java Position");
        javaDeveloperJobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Eugene Zhogoliev");
        Observer secondSubscriber = new Subscriber("Alexey aaaa");


        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);

        javaDeveloperJobSite.addVacancy("Third Java Position");
javaDeveloperJobSite.removeVacancy("First Java Position");
    }
}
