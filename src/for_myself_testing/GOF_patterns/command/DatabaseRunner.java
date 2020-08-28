package for_myself_testing.GOF_patterns.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        developer.inserRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
