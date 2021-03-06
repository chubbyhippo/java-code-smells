import java.time.LocalDateTime;

public class PrimitiveObsession {
    public class Problem {

        public class CheckingAccount {
            private int accountNumber;
            private String customerName;
            private String email;

            private String address;
            private String zipCode;
            private String city;
            private String state;
            private String country;

            private String socialSecurityNumber;
            private LocalDateTime activateDate;

            // getters and setters
        }

    }

    public class Solution {

        public class Customer {
        }

        public class Address {
        }

        public class SocialSecurity {
        }

        public class CheckingAccount {
            private int accountNumber;
            private Customer customer;
            private Address address;
            private LocalDateTime activateDate;
            private SocialSecurity socialSecurity;
            // getters and setters
        }
    }
}
