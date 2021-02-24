public class DataClumps {
    public class Problem {
        public class Customer {
            private String firstName;
            private String lastName;
            private String title;
            private String house;
            private String street;
            private String city;
            private String postcode;
            private String country;
            // getters and setters
        }
    }

    public class Solution {
        public class Address {
            private String title;
            private String house;
            private String street;
            private String city;
            private String postcode;
            private String country;
            // getters and setters
        }
        public class Customer {
            private String firstName;
            private String lastName;
            private Address address;
            // getter and setters
        }
    }
}
