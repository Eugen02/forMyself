package for_myself_testing.GOF_patterns.command;

public class Database {
    public void insert(){
        System.out.println("Inserting record...");
    }

    public void update(){
        System.out.println("Updating record...");
    }

    public void select(){
        System.out.println("Reading record...");
    }

    public void delete(){
        System.out.println("Deleting record...");
    }
}
