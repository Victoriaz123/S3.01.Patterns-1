public class Main {
    public static void main(String[] args) {
        AbstractFactory USAFactory = new USAAbstractFactory();
        AbstractFactory SpainFactory = new SpainAbstractFactory();


        ManageContacts USAManager = new ManageContacts(USAFactory);
        ManageContacts SpainManager = new ManageContacts(SpainFactory);


        USAManager.addAddress("Ocean dr 105", "Miami", "Florida", "33101");
        USAManager.addPhoneNumber("305", "5553890");

        SpainManager.addAddress("Roger de flor 45", "Barcelona", "Catalunya", "08018");
        SpainManager.addPhoneNumber("513747540");

        System.out.println("\nUSA Contacts:");
        USAManager.displayContacts();

        System.out.println("\nFrance Contacts:");
        SpainManager.displayContacts();
    }
}