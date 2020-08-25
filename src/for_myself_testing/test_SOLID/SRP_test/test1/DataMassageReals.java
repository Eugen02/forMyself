package for_myself_testing.test_SOLID.SRP_test.test1;

public class DataMassageReals implements  IDataMassage{

    @Override
    public void send(String massage) {
        System.out.println("You send this massage: " + massage);
    }

    @Override
    public String receive(String massage) {
        return "You got this massage: " + massage;
    }

}
