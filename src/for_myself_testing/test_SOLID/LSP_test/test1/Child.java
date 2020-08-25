package for_myself_testing.test_SOLID.LSP_test.test1;

public class Child extends Parent{
    @Override
    public void doSMth() {
        super.doSMth();
    }


    // correct!!!
//    @Override
//    public void doSMth() {
//        throw new RuntimeException();
//    }

}
