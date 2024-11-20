public class USAAbstractFactory implements AbstractFactory{

    @Override
    public Address createAddress(String... details) {
        return new USAAddress(details[0], details[1], details[2], details[3]);
    }

    @Override
    public PhoneNumber createPhoneNumber(String... details) {
        return new USAPhoneNumber(details[0], details[1]);
    }
}

