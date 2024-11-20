public class USAPhoneNumber implements PhoneNumber{
    private String areaCode, number;

    public USAPhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }
    @Override
    public String getNumber() {
        return "+1 (" + areaCode + ") " + number;
    }

}
