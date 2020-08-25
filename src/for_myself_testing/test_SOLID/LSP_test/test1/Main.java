package for_myself_testing.test_SOLID.LSP_test.test1;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.doSMth();
        parent = new Child();                       /// un_correct
        parent.doSMth();

        //check child how d this shit correct sl

    }
}
