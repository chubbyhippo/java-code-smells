public class FeatureEnvy {
    public class Problem {
        public class Phone {
            private final String unformattedNumber;

            public Phone(String unformattedNumber) {
                this.unformattedNumber = unformattedNumber;
            }

            public String getAreaCode() {
                return unformattedNumber.substring(0, 3);
            }

            public String getPrefix() {
                return unformattedNumber.substring(3, 6);
            }

            public String getNumber() {
                return unformattedNumber.substring(6, 10);
            }
        }

        public class Customer {
            private Phone mobilePhone;

            public String getMobilePhoneNumber() {
                return "(" +
                        mobilePhone.getAreaCode() + ") " +
                        mobilePhone.getPrefix() + "-" +
                        mobilePhone.getNumber();
            }
        }

    }

    public class Solution {
        public class Phone {
            private final String unformattedNumber;

            public Phone(String unformattedNumber) {
                this.unformattedNumber = unformattedNumber;
            }

            private String getAreaCode() {
                return unformattedNumber.substring(0, 3);
            }

            private String getPrefix() {
                return unformattedNumber.substring(3, 6);
            }

            private String getNumber() {
                return unformattedNumber.substring(6, 10);
            }

            public String toFormattedString() {
                return "(" + getAreaCode() + ") " + getPrefix() + "-" + getNumber();
            }
        }

        public class Customer {
            private Phone mobilePhone;

            public String getMobilePhoneNumber() {
                return mobilePhone.toFormattedString();
            }
        }
    }
}
