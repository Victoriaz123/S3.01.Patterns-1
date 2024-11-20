public interface AbstractFactory {
    Address createAddress(String... details);
    PhoneNumber createPhoneNumber(String... details);
}

