package for_myself_testing.test_SOLID.SRP_test.test1;

public class Phone {
    public static void main(String[] args) {
        PhoneFunction phone = new PhoneFunction(new DataConnectReals(),new DataMassageReals());

        phone.connect("+380976456104");
        phone.disconnect();

        phone.send("You fUcking SlaveS");
        System.out.println(phone.receive("No u"));
    }
}
