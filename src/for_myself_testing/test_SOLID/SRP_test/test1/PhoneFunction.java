package for_myself_testing.test_SOLID.SRP_test.test1;

public class PhoneFunction implements IDataMassage, IDataConnect{
    DataConnectReals dataConnectReals;
    DataMassageReals dataMassageReals;

    public PhoneFunction(DataConnectReals dataConnectReals, DataMassageReals dataMassageReals) {
        this.dataConnectReals = dataConnectReals;
        this.dataMassageReals = dataMassageReals;
    }

    @Override
    public void connect(String number) {
        dataConnectReals.connect(number);
    }

    @Override
    public void disconnect() {
        dataConnectReals.disconnect();
    }

    @Override
    public void send(String massage) {
        dataMassageReals.send(massage);
    }

    @Override
    public String receive(String massage) {
        return dataMassageReals.receive(massage);
    }
}
