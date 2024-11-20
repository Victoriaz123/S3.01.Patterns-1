import java.util.ArrayList;
import java.util.List;

public class ManageContacts {

    private final List<Address> addresses = new ArrayList<>();
    private final List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private final AbstractFactory factory;

    public ManageContacts(AbstractFactory factory) {
        this.factory = factory;
    }


    public void addAddress(String... details) {
        Address address = factory.createAddress(details);
        addresses.add(address);
        System.out.println("Address added: " + address.getAddress());
    }

    public void addPhoneNumber(String... details) {
        PhoneNumber phoneNumber = factory.createPhoneNumber(details);
        phoneNumbers.add(phoneNumber);
        System.out.println("Phone number added: " + phoneNumber.getNumber());
    }

    public void displayContacts() {
        System.out.println("\nAddresses:");
        addresses.forEach(address -> System.out.println(" - " + address.getAddress()));

        System.out.println("\nPhone Numbers:");
        phoneNumbers.forEach(phone -> System.out.println(" - " + phone.getNumber()));
    }
}

