package for_myself_testing.GOF_patterns.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
        JavaDeveloper developer = new JavaDeveloper("Eugene Zhogoliev", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Developer: "+ developer.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

    }
}
