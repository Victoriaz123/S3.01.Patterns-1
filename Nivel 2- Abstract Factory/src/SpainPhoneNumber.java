public class SpainPhoneNumber implements PhoneNumber{

        private String countryCode, number;

        public SpainPhoneNumber(String number) {
            this.number = number;
        }

        @Override
        public String getNumber() {
            return "+34 " + number;
        }
}

