package for_myself_testing.GOF_patterns.command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void inserRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}
