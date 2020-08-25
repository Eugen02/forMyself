package for_myself_testing.test_SOLID.SRP_test.test1;

public class DataConnectReals implements IDataConnect{

    @Override
    public void connect(String number) {
        System.out.println("You call this number: " + number);
    }

    @Override
    public void disconnect() {
        System.out.println("You got disconnect !");
    }

}
